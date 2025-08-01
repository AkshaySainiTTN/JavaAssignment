package com.jpa3.entities.manytomany;

import com.jpa3.embeds.Address;
import com.jpa3.entities.Subject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Author_4 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address address;

    @OneToMany
    private List<Subject> subjects;

    @ManyToMany(mappedBy = "author")
    private List<Book_4> book;

    public Author_4(Address address, List<Subject> subjects, String name) {
        this.address = address;
        this.subjects = subjects;
    }
}
