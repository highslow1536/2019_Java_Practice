package com.company;

import java.util.Scanner;

public class exam3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 스캐너 시작

        System.out.print("정수를 입력하시오>>");
        int n = scanner.nextInt();  // 사용자에게서 정수를 입력받음
        for (int i = n; i > 0; i--) {   // *탑을 n층 생성
            for (int j = 0; j < i; j++) {   // 역삼각형 모양으로 생성
                System.out.print("*");
            }
            System.out.println();   // 다음 층으로 넘어가기 위한 줄바꿈
        }

        scanner.close();    // 스캐너 종료
    }
}
