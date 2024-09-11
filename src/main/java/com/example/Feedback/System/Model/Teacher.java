package com.example.Feedback.System.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String fatherName;
    private String mobileNumber;
    private String email;
    private String department;

    @OneToMany(mappedBy = "teacher")
    private List<Subject> subjects;

    // Getters, Setters, Constructors
}

