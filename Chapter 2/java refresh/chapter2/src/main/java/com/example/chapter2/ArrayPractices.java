package com.example.chapter2;

import java.util.ArrayList;

class ArraysPractices {
    public static void main(String[] args) {
        int vivek[]={10,20,30,40,15};
        System.out.println(vivek[0]);
        System.out.println(vivek[4]);
        ArrayList p = new ArrayList();
        p.add(3);
        p.add("4532");
        p.add(23);
        for (Object o : p)
        System.out.println("Object is " + o);
    }
}
