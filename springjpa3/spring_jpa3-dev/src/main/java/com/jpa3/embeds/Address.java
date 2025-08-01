package com.jpa3.embeds;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {

    private int streetNumber;
    private String location;
    private String state;
}
