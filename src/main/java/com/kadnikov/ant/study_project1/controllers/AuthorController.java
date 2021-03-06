package com.kadnikov.ant.study_project1.controllers;

import com.kadnikov.ant.study_project1.repositories.AuthorRepository;
import com.kadnikov.ant.study_project1.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model) {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
