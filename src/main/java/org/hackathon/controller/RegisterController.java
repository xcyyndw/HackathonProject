package org.hackathon.controller;

import org.hackathon.entity.Voter;
import org.hackathon.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/register")
@RestController
public class RegisterController {

    @Autowired
    private VoterService voterService;

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/voter/save/{name}/{age}")
    public String register(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        Voter voter = new Voter(name, age);
        voterService.createVoter(voter);
        return voter.toString();
    }

    @RequestMapping("/voter/get/{name}")
    public String getVoter(@PathVariable("name") String name) {
        return voterService.getVoter(name).toString();
    }
}
