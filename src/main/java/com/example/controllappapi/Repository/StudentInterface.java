package com.example.controllappapi.Repository;

import com.example.controllappapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInterface extends JpaRepository<Student, Long> {
}
