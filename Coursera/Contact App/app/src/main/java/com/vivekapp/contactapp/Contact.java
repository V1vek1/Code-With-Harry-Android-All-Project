package com.vivekapp.contactapp;

public class Contact {
    public String name;   //Here we take String
    public String phone;  //Here we take String

    public Contact(String name, String phone) { //Here i am generated the Cunstructor for both string
        this.name = name;
        this.phone = phone;
    }

    public String getName() {  //Here i am generated getter and setter for both String
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
