package com.example.projectBackend.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.projectBackend.model.bookEvent;
import org.springframework.stereotype.Repository;

@Repository
public interface bookEventRepository extends CrudRepository<bookEvent, Integer> {

}
