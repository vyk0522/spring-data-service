package com.onejava.entities;

import com.onejava.repositories.SessionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SessionTest {
    @Autowired
    private SessionRepository sessionRepository;

    @Test
    public void test() {
        List<Session> sessions = sessionRepository.findBySessionNameContains("Java");
        assertFalse(CollectionUtils.isEmpty(sessions));
    }

    @Test
    public void testPagingAndSorting() {
        Page<Session> page = sessionRepository
                .findBySessionNameLike("%S%",
                        PageRequest.of(1, 5, Sort.by(Sort.Direction.DESC, "sessionLength")));
        assertTrue(page.getTotalElements() > 0);

        // For multiple pages
        List<Session> sessions = new ArrayList<>();
        Page<Session> sessionPage;
        int pageNumber = 0;
        do {
            sessionPage = sessionRepository
                    .findBySessionNameLike("%S%",
                            PageRequest.of(pageNumber++, 5, Sort.by(Sort.Direction.DESC, "sessionLength")));
            sessions.addAll(sessionPage.getContent());
        }while (! sessionPage.isLast() && pageNumber < 300);

        assertEquals(62, sessions.size());
    }

    @Test
    public void testCustomImpl() {
        List<Session> sessions = sessionRepository.customGetSessions();
        assertTrue(sessions.size() > 0);
    }


}