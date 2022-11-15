package com.example.springmvc.pojo;


public class Apimodel {

    public Apimodel(int num1, int num2, String name, String lastn) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
        this.lastn = lastn;
    }

    public String toString() {
        return "Apimodel{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", name='" + name + '\'' +
                ", lastn='" + lastn + '\'' +
                '}';
    }


    private int num1;
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }



    private int num2;
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String lastn;

    public String getLastn() {
        return lastn;
    }

    public void setLastn(String lastn) {
        this.lastn = lastn;
    }




}
