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
    public void createVoter(Voter voter){
        voterRepository.save(voter);
    }

    @Override
    public Voter getVoter(String name) {
        return voterRepository.findByName(name);
    }
}
