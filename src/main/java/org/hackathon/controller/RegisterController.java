package org.hackathon.controller;

import org.hackathon.entity.Voter;
import org.hackathon.response.RequestResponse;
import org.hackathon.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
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
        } else {
            return ResponseEntity.ok(RequestResponse.success(voterService.registerToVote(voter)));
        }
    }

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> update(@RequestBody Voter voter) {
        return ResponseEntity.ok(RequestResponse.success(voterService.update(voter)));
    }

    @GetMapping(value = "/phone/{phone}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> findVoterByIdentity(@PathVariable("phone") String phone) {
        return ResponseEntity.ok(RequestResponse.success(voterService.findByPhone(phone)));
    }

    @GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestResponse<Voter>> findVoterByEmail(@PathVariable("email") String email) {
        return ResponseEntity.ok(RequestResponse.success(voterService.findByEmail(email)));
    }
}
