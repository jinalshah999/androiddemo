package com.example.jinanshshah.myapplication;

/**
 * Created by jinanshshah on 5/19/2017.
 */

public class employee {

    int id;
    String name;

    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}