package com.onejava.repositories;

import com.onejava.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

    List<Speaker> findByFirstNameAndLastName(String firstName, String lastname);

}