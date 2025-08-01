package com.jpa3.service;

import com.jpa3.dto.AuthorReqDto;
import com.jpa3.entities.Author;
import com.jpa3.repo.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addAuthor(AuthorReqDto authorReqDto) {
        authorRepository.save(new Author(authorReqDto.address(),authorReqDto.subjects(),authorReqDto.name()));
    }
}
