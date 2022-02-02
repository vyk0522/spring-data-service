package com.onejava.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "speaker")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "speaker_bio")
    private String speakerBio;

    @Lob
    @Column(name = "speaker_photo")
    private byte[] speakerPhoto;

    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Speaker speaker = (Speaker) o;
        return id != null && Objects.equals(id, speaker.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}