package com.example.demo.Service;


import com.example.demo.Repository.AutomatedtestsRepository;


import com.example.demo.model.Automatedtests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomatedtestsService {

        @Autowired
        private AutomatedtestsRepository automatedtestsRepository;

        public Automatedtests saveall(Automatedtests automatedtests){
           return automatedtestsRepository.save(automatedtests);

    }
        public List<Automatedtests> getall(){

            return automatedtestsRepository.findAll();
    }

}
