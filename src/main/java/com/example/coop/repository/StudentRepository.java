package com.example.coop.repository;

import com.example.coop.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel,Long> {
}
