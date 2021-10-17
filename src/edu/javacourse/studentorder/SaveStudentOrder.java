package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {


    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder (StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder ");

        return answer;
    }

    static StudentOrder buidStudentOrder () {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Андрей");
        so.setHusbend(husband);
        return so;
    }
}
