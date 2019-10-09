package com.company;

class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override       // 예제 6-2를 위한 메소드 오버라이딩
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    @Override       // 예제 6-3을 위한 메소드 오버라이딩
    public boolean equals(Object obj) {
        Point p = (Point)obj;   // 객체 obj를 Point 타입으로 다운 캐스팅
        if (x == p.x && y == p.y) return true;
        else return false;
    }
}

public class ObjectPropertyEx {
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());   // 클래스 이름
        System.out.println(obj.hashCode()); // 해시 코드 값
        System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
        System.out.println(obj);    // 객체 출력
    }

    public static void main(String[] args) {
        Point p = new Point(2,3);
        print(p);
    }
}
