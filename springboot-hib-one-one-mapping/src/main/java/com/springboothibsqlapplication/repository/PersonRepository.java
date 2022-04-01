package com.springboothibsqlapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboothibsqlapplication.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
