package com.example.Feedback.System.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
public class PerformanceDTO {

    private Double Q1Rating;
    private Double Q2Rating;
    private Double Q3Rating;
    private Double Q4Rating;
    private Double Q5Rating;
    private Double Q6Rating;
    private Double Q7Rating;
    private Double Q8Rating;
    private Double Q9Rating;
    private Double Q10Rating;


    private List<String> improvementSuggestions;


    public PerformanceDTO(Double parameter1, Double parameter2, Double parameter3,
                                 Double parameter4, Double parameter5, Double parameter6,
                                 Double parameter7, Double parameter8, Double parameter9,
                                 Double parameter10) {
        this.Q1Rating = parameter1;
        this.Q2Rating = parameter2;
        this.Q3Rating = parameter3;
        this.Q4Rating = parameter4;
        this.Q5Rating = parameter5;
        this.Q6Rating = parameter6;
        this.Q7Rating = parameter7;
        this.Q8Rating = parameter8;
        this.Q9Rating = parameter9;
        this.Q10Rating = parameter10;
    }


}
