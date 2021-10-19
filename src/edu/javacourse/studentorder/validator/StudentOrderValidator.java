package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.SaveStudentOrder;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.AnswerWedding;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WedingValidator wedingValidator;
    private ChildrenValidator childrenValidator;
    private StudentsValidator studentsValidator;
    private MailSender mailSender;

    public StudentOrderValidator () {
        cityRegisterValidator = new CityRegisterValidator();
        wedingValidator = new WedingValidator();
        childrenValidator = new ChildrenValidator();
        studentsValidator = new StudentsValidator();
        mailSender = new MailSender();
    }


    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }
    public void checkAll() {
            StudentOrder[] soArray = readStudentOrders();

            for (int i = 0; i < soArray.length; i++) {
                System.out.println();
                chekOneOrder(soArray[i]);
            }

    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];

        for (int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }
    public void chekOneOrder (StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        AnswerWedding wedAnswer = checkWedding(so);

        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }
    public AnswerWedding checkWedding (StudentOrder so) {
        return wedingValidator.checkWedding(so);
    }
    public AnswerChildren checkChildren (StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }
    public AnswerStudent checkStudent (StudentOrder so) {
        return studentsValidator.checkStudent(so);
    }
    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
