package org.hackathon.service;

import org.hackathon.entity.Voter;

public interface VoterService {
    Voter registerToVote(Voter voter);
    Voter update(Voter voter);
    Voter findByPhone(String phone);
    Voter findByEmail(String email);
}
