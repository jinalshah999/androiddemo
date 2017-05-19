package com.example.jinanshshah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class getall_employee extends AppCompatActivity {

    ListView mListView;
    ArrayList<employee> mArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getall_employee);
        mListView= (ListView) findViewById(R.id.lstemp);
        mArrayList=new ArrayList<employee>();
        mArrayList.add(new employee(1,"jinal"));
        mArrayList.add(new employee(2,"shreenil"));
        mArrayList.add(new employee(3,"het"));
        mListView.setAdapter(new employee_custom_adapter(getall_employee.this,mArrayList));
    }
}
