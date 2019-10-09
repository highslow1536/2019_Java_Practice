package app;

import base.Shape;  // base 패키지의 Shape 클래스 임포트
import derived.Circle;  // derived 패키지의 Circle 클래스 임포트

public class GraphicEditor {    // app 패키지에 GraphicEditor 클래스 분리 작성
    public static void main(String[] args) {
        Shape shape = new Circle();     // 업캐스팅
        shape.draw();       // 메소드 호출
    }
}
