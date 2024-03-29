package com.company;

public class Circle {
    int radius;
    String name;

    public Circle() {
        this.radius = 1;
        this.name = "";
    }

    public Circle(int radius, String n){
        this.radius = radius; this.name = n;
    }

    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

        Circle hodduk = new Circle();
        hodduk.radius = 5;
        hodduk.name = "자바호떡";
        area = hodduk.getArea();
        System.out.println(hodduk.name + "의 면적은  " + area);
    }
}
