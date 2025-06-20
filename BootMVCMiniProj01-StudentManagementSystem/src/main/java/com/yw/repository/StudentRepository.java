package com.yw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yw.model.Student_Info;

public interface StudentRepository extends JpaRepository<Student_Info, Integer> {

}
