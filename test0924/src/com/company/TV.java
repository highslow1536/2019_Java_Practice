package com.company;

public class TV {
    String company;
    int year;
    int size;

    public TV(String com, int year, int size){
        this.company = com;
        this.year = year;
        this.size = size;
    }

    public void show(){
        System.out.println(this.company + "에서 만든 " + this.year + "년형 " + this.size + "인치 TV");
    }

    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
