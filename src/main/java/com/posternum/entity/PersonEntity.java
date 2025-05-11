package com.posternum.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "text")
    private String person;

    public PersonEntity(UUID id, String person) {
        this.id = id;
        this.person = person;
    }

    public UUID getId() {
        return id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
