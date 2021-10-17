package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerChildren;

public class ChildrenValidator {
    public AnswerChildren checkChildren (StudentOrder so) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }
}
