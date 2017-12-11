package com.example.android_razrab.realmmigration;

import io.realm.RealmObject;

/**
 * Created by android_razrab on 11/12/2017.
 */

public class UserData extends RealmObject {

    private String name;
    private int age;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
