package org.hackathon.repository;

import org.hackathon.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, String> {
    Voter findByIdentity(String identity);

    Voter findByEmail(String email);
}
