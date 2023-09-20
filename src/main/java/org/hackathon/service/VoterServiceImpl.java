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
    public Voter update(Voter voter) {
        return voterRepository.save(voter);
    }

    @Override
    public Voter findByPhone(String phone) {
        return voterRepository.findByPhone(phone);
    }

    @Override
    public Voter findByEmail(String email) {
        return voterRepository.findByEmail(email);
    }

}
