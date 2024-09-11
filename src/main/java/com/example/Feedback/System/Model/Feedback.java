package com.example.Feedback.System.Model;


import jakarta.persistence.*;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id", "subject_id", "teacher_id"})
})
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer Q1Rating;
    private Integer Q2Rating;
    private Integer Q3Rating;
    private Integer Q4Rating;
    private Integer Q5Rating;
    private Integer Q6Rating;
    private Integer Q7Rating;
    private Integer Q8Rating;
    private Integer Q9Rating;
    private Integer Q10Rating;
    private String comments;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;


}

