package com.example.demo.Repository;

import com.example.demo.model.Automatedtests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AutomatedtestsRepository extends JpaRepository<Automatedtests,Long> {


}
