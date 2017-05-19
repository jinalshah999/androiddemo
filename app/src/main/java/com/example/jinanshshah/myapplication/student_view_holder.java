package com.example.jinanshshah.myapplication;

import android.widget.TextView;

/**
 * Created by jinanshshah on 5/19/2017.
 */

public class student_view_holder {

    TextView tvrno,tvname,tvfees;

    public student_view_holder(TextView tvrno, TextView tvname, TextView tvfees) {
        this.tvrno = tvrno;
        this.tvname = tvname;
        this.tvfees = tvfees;
    }

    public TextView getTvrno() {
        return tvrno;
    }

    public void setTvrno(TextView tvrno) {
        this.tvrno = tvrno;
    }

    public TextView getTvname() {
        return tvname;
    }

    public void setTvname(TextView tvname) {
        this.tvname = tvname;
    }

    public TextView getTvfees() {
        return tvfees;
    }

    public void setTvfees(TextView tvfees) {
        this.tvfees = tvfees;
    }
}
