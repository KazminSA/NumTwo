package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerChildren;

public class ChildrenValidator {
    AnswerChildren checkChildren (StudentOrder so) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }
}
