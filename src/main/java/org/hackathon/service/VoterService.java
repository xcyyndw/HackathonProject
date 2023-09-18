package org.hackathon.service;

import org.hackathon.entity.Voter;

public interface VoterService {
    Voter registerToVote(Voter voter);
    Voter findVoterByIdentity(String identity);
    Voter findVoterByEmail(String email);
}
