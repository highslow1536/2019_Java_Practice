package derived;    // derived 패키지에 분리 작성

import base.*;  // base 패키지 임포트

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
