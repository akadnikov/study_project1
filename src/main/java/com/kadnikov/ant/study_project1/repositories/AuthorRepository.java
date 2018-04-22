package com.kadnikov.ant.study_project1.repositories;

import com.kadnikov.ant.study_project1.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
