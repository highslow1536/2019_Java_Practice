package com.company;

class Km2Mile extends Converter{    // Km2Mile 클래스 선언
    public Km2Mile(double ratio){   // 생성자
        this.ratio = ratio;
    }
    @Override       // 추상 메소드 convert() 구현
    protected double convert(double src) {
        return src/ratio;
    }
    @Override       // 추상 메소드 getSrcString() 구현
    protected String getSrcString() {
        return "Km";
    }
    @Override       // 추상 메소드 getDestString() 구현
    protected String getDestString() {
        return "mile";
    }
}

public class exam5_4 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);  // 1마일은 1.6Km
        toMile.run();       // toMile 변환 실행
    }
}
