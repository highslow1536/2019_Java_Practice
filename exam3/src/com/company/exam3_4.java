package com.company;

import java.util.Scanner;

public class exam3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 스캐너 시작

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String s = scanner.next();  // 소문자 알파벳 하나를 입력받음
//        char c = s.charAt(0);   // String형을 char형으로 변환
        for (char c = s.charAt(0); c >= 'a'; c--) {   // 알파벳 순서만큼 층 생성
            for (char j = 'a'; j <= c; j++) {   // a부터 입력받은 알파벳까지
                System.out.print(j);            // 한 줄 출력
            }
            System.out.println();   // 다음 층으로 넘어가기 위한 줄바꿈
        }

        scanner.close();    // 스캐너 종료
    }
}
