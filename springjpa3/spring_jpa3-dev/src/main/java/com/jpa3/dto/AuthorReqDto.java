package com.jpa3.dto;

import com.jpa3.embeds.Address;
import com.jpa3.entities.Subject;

import java.util.List;

public record AuthorReqDto(String name,
                           List<Subject> subjects,
                           Address address) {
}
