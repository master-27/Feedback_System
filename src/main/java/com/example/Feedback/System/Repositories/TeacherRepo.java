package com.example.Feedback.System.Repositories;

import com.example.Feedback.System.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
    // You can add custom queries here if needed
}
