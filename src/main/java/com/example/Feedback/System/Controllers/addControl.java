package com.example.Feedback.System.Controllers;

import com.example.Feedback.System.Model.Subject;
import com.example.Feedback.System.Repositories.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class addControl {

    @Autowired
    SubjectRepo subRepo;


    @PostMapping("addSubject/")
    ResponseEntity<String> addSubject(@RequestBody Subject subj){
        subRepo.save(subj);
        return  new ResponseEntity("Subject Added" ,HttpStatus.OK);
    }
}
