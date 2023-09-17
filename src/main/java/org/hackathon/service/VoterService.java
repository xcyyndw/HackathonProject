package org.hackathon.service;

import org.hackathon.entity.Voter;

public interface VoterService {
    void createVoter(Voter voter);
    Voter getVoter(String name);
}
