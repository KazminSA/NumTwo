package edu.javacourse.studentorder.domain;

public class StudentOrder {

    private long studentOrderID;
    private Adult husbend;
    private Adult wife;
    private Child child;

    public long getStudentOrderID() {
        return studentOrderID;
    }

    public void setStudentOrderID(long studentOrderID) {
        this.studentOrderID = studentOrderID;
    }

    public Adult getHusbend() {
        return husbend;
    }

    public void setHusbend(Adult husbend) {
        this.husbend = husbend;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
