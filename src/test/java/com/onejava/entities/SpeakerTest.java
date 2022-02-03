package com.onejava.entities;

import com.onejava.repositories.SpeakerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class SpeakerTest {

    @Autowired
    private SpeakerRepository speakerRepository;

    @Test
    public void test() {
        List<Speaker> speakers = speakerRepository.findByFirstNameAndLastName("Justin", "Clark");
        assertFalse(CollectionUtils.isEmpty(speakers));
    }

}