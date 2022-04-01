package com.springboothibsqlapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboothibsqlapplication.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {

}
