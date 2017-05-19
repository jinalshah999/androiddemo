package com.example.jinanshshah.myapplication;

/**
 * Created by jinanshshah on 5/19/2017.
 */

public class student {

   private int rno,fees;
   private String name;

    public student(int rno, int fees, String name) {
        this.rno = rno;
        this.fees = fees;
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
