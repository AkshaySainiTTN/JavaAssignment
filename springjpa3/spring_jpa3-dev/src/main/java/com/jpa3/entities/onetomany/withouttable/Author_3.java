package com.jpa3.entities.onetomany.withouttable;

import com.jpa3.embeds.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Author_3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address address;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Book_3> book3s;
}
