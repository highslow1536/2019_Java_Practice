package com.company;

import java.util.Scanner;

abstract class Shape {      // 추상 클래스 Shape
    private Shape next;
    private String name;    // 도형의 이름
    public Shape() { this("Shape"); }
    public Shape(String name) {
        next = null;
        this.name = name;
    }
    public void setNext(Shape obj) { next = obj; }  // 링크 연결
    public Shape getNext() { return next; }
    public String getName() { return name; }
    public abstract void draw();    // 추상 메소드
}

class Line extends Shape{
    public Line() { super("Line"); }
    public Line(String name){ super(name); }
    @Override
    public void draw() {    // 추상 메소드 draw() 구현
        System.out.println(this.getName());
    }
}
class Rect extends Shape{
    public Rect() { super("Rect"); }
    public Rect(String name){ super(name); }
    @Override
    public void draw() {
        System.out.println(this.getName());
    }
}
class Circle extends Shape{
    public Circle() { super("Circle"); }
    public Circle(String name){ super(name); }
    @Override
    public void draw() {
        System.out.println(this.getName());
    }
}

class GraphicEditor {
    private String name;
    private Shape start;
    private int length;
    public GraphicEditor(String name){     // GraphicEditor 클래스 생성자
        this.name = name;
        this.start = null;
        this.length = 0;
    }
    public String getName() { return name; }

    public void insert(Shape shape){    // 삽입 기능
        if (start == null){     // 아이템이 없는 경우
            start = shape;
            length++;
        }
        else {
            Shape current;
            for (current = start; current.getNext() != null; current = current.getNext()) { }
            current.setNext(shape);     // 끝에 아이템 하나 추가
            length++;
        }
    }
    public Shape delete(int place){     // 삭제 기능
        if (place <= 0){    // 삭제할 위치는 자연수만 가능
            System.out.println("삭제할 수 없습니다.");
            return null;
        }
        if (place > length){    // place 위치에 아이템 없음
            System.out.println("삭제할 수 없습니다.");
            return null;
        }
        else {
            if (place == 1){    // 1번째 위치의 도형을 삭제하는 경우
                Shape deleted = start;
                start = start.getNext();
                length--;
                return deleted;
            }
            int count = 0;
            Shape current;
            for (current = start; current != null; current = current.getNext()) {
                count++;
                if (count == place - 1) {   // 삭제할 위치 바로 직전에서 스탑
                    Shape deleted = current.getNext();
                    current.setNext(current.getNext().getNext());   // deleted의 앞뒤 아이템 연결
                    length--;
                    return deleted;     // 삭제된 아이템 반환
                }
            }
            return current;     // 알고리즘 상 실행될 일 없음
        }
    }
    public void view(){     // 모두 보기 기능
        Shape current;
        for (current = start; current != null; current = current.getNext()) {
            current.draw();     // 위치 순서대로 하나씩 이름 출력
        }
    }
    public void run(){      // 그래픽 에디터 실행
        System.out.println("그래픽 에디터 " + this.name + "을 실행합니다.");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int cmd = scanner.nextInt();
            if (cmd == 1){      // 삽입 모드
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int selectShape = scanner.nextInt();
                switch (selectShape){
                    case 1:     // Line 모양 선택
                        this.insert(new Line());
                        break;
                    case 2:     // Rect 모양 선택
                        this.insert(new Rect());
                        break;
                    case 3:     // Circle 모양 선택
                        this.insert(new Circle());
                        break;
                    default:
                        System.out.println("잘못입력했습니다.");
                        break;
                }
            }
            else if (cmd == 2){     // 삭제 모드
                System.out.print("삭제할 도형의 위치>>");
                int place = scanner.nextInt();
                Shape deleted = this.delete(place);
                if (deleted != null) System.out.println(deleted.getName() + "을 삭제하였습니다.");
            }
            else if (cmd == 3){     // 모두 보기 모드
                this.view();
            }
            else if (cmd == 4){     // 종료 모드
                System.out.println(this.name + "을 종료합니다.");
                break;
            }
            else System.out.println("잘못입력했습니다.");
        }
        scanner.close();
    }
}

public class exam5_12 {
    public static void main(String[] args) {
        GraphicEditor beauty = new GraphicEditor("beauty");     // beauty 객체 생성
        beauty.run();       // beauty 실행
    }
}
