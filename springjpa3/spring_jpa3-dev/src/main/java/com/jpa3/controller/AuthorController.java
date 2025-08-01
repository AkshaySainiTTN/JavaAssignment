package com.jpa3.controller;

import com.jpa3.dto.AuthorReqDto;
import com.jpa3.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/author")
    public ResponseEntity<Void> addAuthor(@RequestBody AuthorReqDto authorReqDto) {
        authorService.addAuthor(authorReqDto);
        return ResponseEntity.ok().build();
    }
}
