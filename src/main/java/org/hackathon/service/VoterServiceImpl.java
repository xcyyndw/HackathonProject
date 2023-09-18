package org.hackathon.service;

import org.hackathon.entity.Voter;
import org.hackathon.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {
    @Autowired
    private VoterRepository voterRepository;

    @Override
    public Voter registerToVote(Voter voter) {
        return voterRepository.save(voter);
    }

    @Override
    public Voter findVoterByIdentity(String identity) {
        return voterRepository.findByIdentity(identity);
    }

    @Override
    public Voter findVoterByEmail(String email) {
        return voterRepository.findByEmail(email);
    }
}
