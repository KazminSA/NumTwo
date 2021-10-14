package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerWedding;

public class WedingValidator {
    public AnswerWedding checkWedding (StudentOrder so) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }
}