package com.example.demo.Controller;


import com.example.demo.Repository.TeamRepository;
import com.example.demo.Service.TeamService;
import com.example.demo.model.Team;
import jdk.internal.instrumentation.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeamController {

    /*private TeamService teamService;*/
    @Autowired
    private TeamRepository teamRepository;

    @PostMapping("/save")
    public Team create(Team team){
        return teamRepository.save(team);
    }
    @GetMapping("/get")
    public List<Team>find() {
        return teamRepository.findAll();
    }

}
