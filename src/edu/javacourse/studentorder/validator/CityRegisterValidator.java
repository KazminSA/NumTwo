package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerCityRegister;

public class CityRegisterValidator {

    public String hostName;
    String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkPerson(so.getHusbend());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
