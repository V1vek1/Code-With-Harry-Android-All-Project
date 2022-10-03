package com.vivekapp.sqllitedb;

public class Employee { //These are constructor, yeh bhi getter and setter ki trah hi aayega
    public Employee(int sno, String name, double increment) {
        this.sno = sno;
        this.name = name;
        this.increment = increment;
    }

    public int getSno() {return sno;}

    public void setSno(int sno) {this.sno = sno;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getIncrement() {return increment;}

    public void setIncrement(double increment) {this.increment = increment;}

    private int sno; //Humne inn tino ko select kiya ek sath or alt + insert click karke getter and setter use kiya, tab jakar yeh uper wale codes aaye h, getter value ko getkarta h or setter vakue ko set karta h
    private String name;
    private double increment;

}
