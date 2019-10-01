package com.company;
class TV {      // 클래스 TV 선언
    String company;
    int year;
    int size;

    public TV(String com, int year, int size){  // 클래스 생성자
        this.company = com;
        this.year = year;
        this.size = size;
    }
    public void show(){     // 객체의 정보를 출력하는 메소드
        System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}
public class exam4_1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);   // 객체 생성
        myTV.show();        // myTV 객체의 show 메소드 호출
    }
}
