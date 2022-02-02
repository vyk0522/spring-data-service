package com.onejava.repositories;

import com.onejava.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {
    List<Session> findBySessionNameContains(String sessionName);

    @Query("select s from Session s where upper(s.sessionName) = upper(?1)")
    List<Session> findBySessionNameIgnoreCase(String sessionName);

    @Modifying
    @Query("delete from Session s where s.sessionName = ?1 or s.sessionDescription not in ?2")
    int deleteBySessionNameOrSessionDescriptionNotIn(String sessionName, Collection<String> sessionDescriptions);

}