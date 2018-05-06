package com.kadnikov.ant.study_project1.repositories;

import com.kadnikov.ant.study_project1.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
