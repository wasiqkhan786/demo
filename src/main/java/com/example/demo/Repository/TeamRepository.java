package com.example.demo.Repository;

import com.example.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.management.jdp.JdpPacket;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {
}
