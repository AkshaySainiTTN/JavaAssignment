package com.jpa3.entities.onetomany.unidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book_1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Author_1 author;
}
