package com.apalya.repository;

import org.springframework.data.repository.CrudRepository;

import com.apalya.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}