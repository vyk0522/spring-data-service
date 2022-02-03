package com.onejava.repositories;

import com.onejava.entities.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long>, SessionCustomRepository {
    // Generated using JPA Palette Method Option
    List<Session> findBySessionNameContains(String sessionName);

    // Generated using JPA Palette Query Option
    @Query("select s from Session s where s.sessionName like ?1")
    Page<Session> findBySessionNameLike(String sessionName, Pageable pageable);
}
