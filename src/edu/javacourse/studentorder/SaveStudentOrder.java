package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        buildStudentOrder(so.getStudentOrderID());
        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder (StudentOrder studentOrder) {
        long answer = 199;

        return answer;
    }

    public static StudentOrder buildStudentOrder (long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderID(id);

        Adult husband = new Adult("Vasiliev", "Andrey", null);

        return so;
    }
}
