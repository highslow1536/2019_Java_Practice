package com.company;

import java.util.Scanner;

public class exam3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 스캐너 시작
        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};    // 과목, 점수 배열 생성
        int i;      // for문 안에서 쓰일 변수 i 선언

        while (true){       // break를 만날 때까지 계속 반복
            System.out.print("과목 이름>>");
            String name = scanner.next();   // 과목 이름 입력받음
            if (name.equals("그만")) break;   // "그만"을 입력받으면 종료
            for (i = 0; i < 5; i++) {   // 입력받은 과목의 위치 검사
                if (name.equals(course[i])){    // 입력받은 과목의 점수 출력
                    System.out.println(name + "의 점수는 " + score[i]);
                    break;      // for 문 종료
                }
            }
            if (i == 5) System.out.println("없는 과목입니다.");    // 과목이 없는 경우
        }

        scanner.close();    // 스캐너 종료
    }
}
