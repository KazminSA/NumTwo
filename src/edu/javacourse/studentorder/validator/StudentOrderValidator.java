package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.AnswerWedding;

public class StudentOrderValidator {


    public static void main(String[] args) {

        checkAll();
    }
    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            if (so == null) {
                break;
            }
            System.out.println("Finish");

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.sucsess) {
                System.out.println("No register in city");
                //continue;
                break;
            }
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);
            AnswerWedding wedAnswer = checkWedding(so);

            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();// Любой текст
        return so;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }
    static AnswerWedding checkWedding (StudentOrder so) {
        WedingValidator wd = new WedingValidator();
        return wd.checkWedding(so);
    }
    static AnswerChildren checkChildren (StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }
    static AnswerStudent checkStudent (StudentOrder so) {
        StudentsValidator sv = new StudentsValidator();
        return sv.checkStudent(so);
    }
    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
