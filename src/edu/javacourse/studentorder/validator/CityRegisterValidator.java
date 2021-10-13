package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerCityRegister;

public class CityRegisterValidator {

    public String hostName;
    String login;
    String password;

    AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("checkCityRegister is running: " + hostName + ", " + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.sucsess = false;
        return ans;
    }
}
