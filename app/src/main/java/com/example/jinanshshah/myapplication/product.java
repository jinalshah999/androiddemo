package com.example.jinanshshah.myapplication;

/**
 * Created by jinanshshah on 5/19/2017.
 */

public class product {

    int pid,pprice;
    String pname;

    public product(int pid, String pname,int pprice) {
        this.pid = pid;
        this.pprice = pprice;
        this.pname = pname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
