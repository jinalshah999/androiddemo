package com.example.jinanshshah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class allproduct extends AppCompatActivity {

    ListView mlst;
    ArrayList<product> mArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allproduct);

        mlst= (ListView) findViewById(R.id.lstallproduct);
        mArrayList=new ArrayList<product>();
        mArrayList.add(new product(1,"maggie",30));
        mArrayList.add(new product(2,"abc",10));
        mArrayList.add(new product(3,"mie",20));

        mlst.setAdapter(new product_custom_adapter(allproduct.this,mArrayList));
    }
}
