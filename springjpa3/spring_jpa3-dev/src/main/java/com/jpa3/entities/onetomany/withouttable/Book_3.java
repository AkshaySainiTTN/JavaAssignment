package com.jpa3.entities.onetomany.withouttable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book_3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    @ManyToOne
    @JoinColumn
    private Author_3 author;
}
