package com.onejava.repositories.custom.impl;

import com.onejava.entities.Session;
import com.onejava.repositories.custom.SessionCustomRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class SessionCustomRepositoryImpl implements SessionCustomRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Session> customGetSessions() {
        return entityManager.createQuery("select s from Session s").getResultList();
    }
}
