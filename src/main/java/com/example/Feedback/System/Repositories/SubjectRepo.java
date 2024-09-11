package com.example.Feedback.System.Repositories;

import com.example.Feedback.System.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {

        // Custom query to find subjects by class ID
        @Query("SELECT s FROM Subject s WHERE s.clas.id = :classId")
        List<Subject> findSubjectsByClasId(@Param("classId") Long classId);

        // You can add other custom queries as needed
    }


