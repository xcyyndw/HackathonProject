package org.hackathon.controller;

import org.hackathon.entity.Voter;
import org.hackathon.response.RequestResponse;
import org.hackathon.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/voter")
@RestController
public class RegisterController {

    @Autowired
    private VoterService voterService;

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> register(@RequestBody Voter voter) {
        if (ObjectUtils.isEmpty(voter)) {
            return ResponseEntity.badRequest().body(RequestResponse.failure("RequestBody is empty"));
        } else if (!StringUtils.hasText(voter.getIdentity())) {
            return ResponseEntity.badRequest().body(RequestResponse.failure("Identity is empty"));
        } else if (!StringUtils.hasText(voter.getEmail())) {
            return ResponseEntity.badRequest().body(RequestResponse.failure("Email is empty"));
        } else {
            return ResponseEntity.ok(RequestResponse.success(voterService.registerToVote(voter)));
        }
    }

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> update(@RequestBody Voter voter) {
        return ResponseEntity.ok(RequestResponse.success(voterService.update(voter)));
    }

    @PostMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<String>> delete(@RequestParam("identity") String identity) {
        return ResponseEntity.ok(RequestResponse.success(voterService.deleteByIdentity(identity)));
    }

    @GetMapping(value = "/identity/{identity}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> findVoterByIdentity(@PathVariable("identity") String identity) {
        return ResponseEntity.ok(RequestResponse.success(voterService.findVoterByIdentity(identity)));
    }

    @GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> findVoterByEmail(@PathVariable("email") String email) {
        return ResponseEntity.ok(RequestResponse.success(voterService.findVoterByEmail(email)));
    }
}
