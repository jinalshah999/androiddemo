package com.example.jinanshshah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class All_students extends AppCompatActivity {

    ListView mListView;
    ArrayList<student> mArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_students);

        mListView= (ListView) findViewById(R.id.lststudent);
        mArrayList=new ArrayList<student>();
        mArrayList.add(new student(1,3000,"jinal"));
        mArrayList.add(new student(2,30000,"meet"));
        mArrayList.add(new student(3,13000,"rutul"));
        mListView.setAdapter(new student_custom_adapter(All_students.this,mArrayList));
    }
}
