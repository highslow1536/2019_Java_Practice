package com.company;

class Circle{
    int x;
    int y;
    int radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public String toString() {  // toString() 메소드 오버라이딩
        return "Circle(" + x + "," + y + ")반지름" + radius;
    }

    @Override
    public boolean equals(Object obj) { // equals() 메소드 오버라이딩
        Circle p = (Circle)obj;     // 다운캐스팅
        if (x == p.x && y == p.y) return true;  // 중심이 같으면 true
        else return false;      // 중심이 다르면 false
    }
}

public class exam6_2 {
    public static void main(String[] args) {
        Circle a = new Circle(2,3,5);   // 중심 (2,3)에 반지름 5인 원
        Circle b = new Circle(2,3,30);  // 중심 (2,3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if (a.equals(b)) System.out.println("같은 원");
        else System.out.println("서로 다른 원");
    }
}
