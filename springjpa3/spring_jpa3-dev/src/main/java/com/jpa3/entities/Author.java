package com.jpa3.entities;

import com.jpa3.embeds.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address address;

    @OneToMany
    private List<Subject> subjects;

    @OneToOne(mappedBy = "author")
    private Book book;

    public Author(Address address, List<Subject> subjects, String name) {
        this.address = address;
        this.subjects = subjects;
    }
}
