package org.hackathon.controller;

import org.hackathon.entity.Voter;
import org.hackathon.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Voter> register(@RequestBody Voter voter) {
        if (ObjectUtils.isEmpty(voter)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Voter());
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(voterService.registerToVote(voter));
        }
    }

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Voter> findVoterByIdentity(@PathVariable("id") String id) {
        return ResponseEntity.status(HttpStatus.OK).body(voterService.findVoterByIdentity(id));
    }

    @GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Voter> findVoterByEmail(@PathVariable("email") String email) {
        return ResponseEntity.status(HttpStatus.OK).body(voterService.findVoterByEmail(email));
    }
}
