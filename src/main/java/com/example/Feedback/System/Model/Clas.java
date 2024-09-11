package com.example.Feedback.System.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Clas {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String program;
        private String semester;
        private String section;

        @OneToMany(mappedBy = "studentClass")
        private List<Student> students;


        // Getters, Setters, Constructors
        @OneToMany(mappedBy = "clas")
        private List<Subject> SubjectList;


}
