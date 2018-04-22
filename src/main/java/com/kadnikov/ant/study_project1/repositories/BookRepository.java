package com.kadnikov.ant.study_project1.repositories;

import com.kadnikov.ant.study_project1.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>  {
}
