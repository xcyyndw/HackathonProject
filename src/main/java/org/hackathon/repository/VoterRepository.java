package org.hackathon.repository;

import org.hackathon.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, Integer> {
    Voter findByName(String name);
}
