package com.example.Feedback.System.Repositories;

import com.example.Feedback.System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Long> {
    // You can add custom queries here if needed
}
