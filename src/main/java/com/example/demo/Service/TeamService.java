package com.example.demo.Service;


import com.example.demo.Repository.TeamRepository;
import com.example.demo.model.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    TeamRepository teamRepository;

    public List<Team>  getall(){
        return teamRepository.findAll();
    }
    public Team save(Team team)
    {
        return teamRepository.save(team);
    }


}
