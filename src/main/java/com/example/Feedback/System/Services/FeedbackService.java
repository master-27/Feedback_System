package com.example.Feedback.System.Services;

import com.example.Feedback.System.DTO.PerformanceDTO;
import com.example.Feedback.System.Repositories.FeedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedRepo fRepo;

    public PerformanceDTO getTeacherPerformance(Long teacherId, Long subjectId) {
        Object[] data = fRepo.findTeacherPerformanceBySubject(teacherId, subjectId);

        if(data == null){
            throw new IllegalArgumentException("No feedback found for the teacher and subject.");

        }
        PerformanceDTO dto = new PerformanceDTO((Double) data[0],(Double) data[1],(Double) data[2],
                (Double) data[3],(Double) data[4],(Double) data[5],
                (Double) data[6],(Double) data[7],(Double) data[8],
                (Double) data[9]);



        return null;
    }

    private List<String> generateSuggestions(PerformanceDTO dto) {
        List<String> suggestions = new ArrayList<>();

        if (dto.getQ1Rating() < 3) {
            suggestions.add("The teacher should try different teaching methods to make the class more engaging, such as group activities, discussions, or case studies.");
        }
        if (dto.getQ2Rating() < 3) {
            suggestions.add("The teacher should connect course material to current events, real-world applications, or other relevant topics to provide a broader perspective.");
        }
        if (dto.getQ3Rating() < 3) {
            suggestions.add("The teacher should improve communication skills by simplifying complex concepts and encouraging more student interaction.");
        }
        if (dto.getQ4Rating() < 3) {
            suggestions.add("The teacher should work on generating more interest in the class by using engaging examples and interactive activities.");
        }
        if (dto.getQ5Rating() < 3) {
            suggestions.add("The teacher should provide more context by linking the course material to real-life scenarios or interdisciplinary topics.");
        }
        if (dto.getQ6Rating() < 3) {
            suggestions.add("The teacher should make themselves more accessible for student consultations and foster an open-door policy for academic support.");
        }
        if (dto.getQ7Rating() < 3) {
            suggestions.add("The teacher should take more initiative in formulating creative assignments, tests, and projects to challenge students and enhance learning.");
        }
        if (dto.getQ8Rating() < 3) {
            suggestions.add("The teacher should focus on being more regular in conducting classes to maintain consistency in learning.");
        }
        if (dto.getQ9Rating() < 3) {
            suggestions.add("The teacher should ensure the course is completed in a thorough and satisfactory manner, ensuring all topics are adequately covered.");
        }
        if (dto.getQ10Rating() < 3) {
            suggestions.add("The teacher should strive to be more fair and transparent in evaluating student performance, ensuring equal opportunities for all.");
        }

        return suggestions;
    }


}
