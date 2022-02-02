package com.onejava.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class SpeakerDto implements Serializable {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String title;
    private final String company;
    private final String speakerBio;
    private final byte[] speakerPhoto;
}
