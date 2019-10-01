package com.company;
class Rectangle {       // Rectangle 클래스 선언
    int x;
    int y;
    int width;
    int height;
    public int square(){    // 사각형의 넓이를 반환하는 메소드
        return width*height;
    }
    public void show(){     // 사각형의 정보를 출력하는 메소드
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형 \n", x, y, width, height);
    }
    public boolean contains(Rectangle r){       // 사각형의 포함여부를 반환하는 메소드
        if ((this.x < r.x) && (this.y < r.y) && (this.x+this.width > r.x+r.width) && (this.y+this.height > r.y+r.height)){
            return true;
        }
        else return false;
    }
    Rectangle(int x, int y, int wid, int hei){      // 생성자
        this.x = x;
        this.y = y;
        this.width = wid;
        this.height = hei;
    }
}
public class exam4_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);    // 객체들 생성
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());     // 객체 s의 면적 출력
        if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if (t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
