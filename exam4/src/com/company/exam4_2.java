package com.company;
import java.util.Scanner;
class Grade {       // 클래스 선언
    private int math;
    private int science;
    private int english;
    public Grade(int math, int sci, int eng){   // 생성자
        this.math = math;
        this.science = sci;
        this.english = eng;
    }
    public double average() {   // 객체의 평균을 반환하는 메소드
        return (this.math + this.science + this.english) / 3.0;
    }
}
public class exam4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);   // 객체를 생성
        System.out.printf("평균은 %.2f", me.average());  // 평균을 출력
        scanner.close();
    }
}
