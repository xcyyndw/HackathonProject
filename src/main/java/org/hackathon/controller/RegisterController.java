package org.hackathon.controller;

import org.hackathon.entity.Achievement;
import org.hackathon.entity.Voter;
import org.hackathon.response.ListResponse;
import org.hackathon.response.SingleResponse;
import org.hackathon.service.AchievementService;
import org.hackathon.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/voter")
@CrossOrigin
@RestController
public class RegisterController {

    @Autowired
    private VoterService voterService;
    @Autowired
    private AchievementService achievementService;

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleResponse<Voter>> register(@RequestBody Voter voter) {
        if (ObjectUtils.isEmpty(voter)) {
            return ResponseEntity.badRequest().body(SingleResponse.failure("RequestBody is empty"));
        } else {
            return ResponseEntity.ok(SingleResponse.success(voterService.registerToVote(voter)));
        }
    }

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleResponse<Voter>> update(@RequestBody Voter voter) {
        return ResponseEntity.ok(SingleResponse.success(voterService.update(voter)));
    }

    @GetMapping(value = "/phone/{phone}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleResponse<Voter>> findVoterByPhone(@PathVariable("phone") String phone) {
        Voter result = voterService.findByPhone(phone);
        if (ObjectUtils.isEmpty(result)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(SingleResponse.failure("User Not Found"));
        }
        return ResponseEntity.ok(SingleResponse.success(voterService.findByPhone(phone)));
    }

    @GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleResponse<Voter>> findVoterByEmail(@PathVariable("email") String email) {
        Voter result = voterService.findByEmail(email);
        if (ObjectUtils.isEmpty(result)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(SingleResponse.failure("User Not Found"));
        }
        return ResponseEntity.ok(SingleResponse.success(voterService.findByEmail(email)));
    }

    @GetMapping(value = "/achievement/query/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ListResponse<Achievement>> findAchievementByEmail(@PathVariable("email") String email) {
        return ResponseEntity.ok(ListResponse.success(achievementService.findByEmail(email)));
    }
}
