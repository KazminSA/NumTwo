package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerStudent;

public class StudentsValidator {
   AnswerStudent checkStudent (StudentOrder so) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }
}
