package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerStudent;

public class StudentsValidator {
   public AnswerStudent checkStudent (StudentOrder so) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }
}
