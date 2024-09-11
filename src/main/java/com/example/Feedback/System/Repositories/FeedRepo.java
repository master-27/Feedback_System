package com.example.Feedback.System.Repositories;

import com.example.Feedback.System.Model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FeedRepo extends JpaRepository<Feedback, Long> {

    //to check if student has already given feedback for this subject.
   boolean existsByStudentIdAndSubjectIdAndTeacherId(Long studentId, Long subjectId, Long teacherId);

   //to fetch the given feedback
   Optional<Feedback> findByStudentIdAndSubjectIdAndTeacherId(Long studentId, Long subjectId, Long teacherId);

   //query for fetching all 10 questions rating.
   @Query("SELECT AVG(f.Q1Rating), AVG(f.Q2Rating), AVG(f.Q3Rating), AVG(f.Q4Rating), " +
           "AVG(f.Q5Rating), AVG(f.Q6Rating), AVG(f.Q7Rating), AVG(f.Q8Rating), " +
           "AVG(f.Q9Rating), AVG(f.Q10Rating) " +
           "FROM Feedback f WHERE f.teacher.id = :teacherId AND f.subject.id = :subjectId")
    Object[] findTeacherPerformanceBySubject(@Param("teacherId") Long teacherId, @Param("subjectId") Long subjectId);

}

