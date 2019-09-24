package com.company;

import java.util.Scanner;

public class exam3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 스캐너 시작
        int n[] = new int[10];  // 크기 10짜리 정수배열 생성

        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < 10; i++) {
            n[i] = scanner.nextInt();
        }   // 정수 10개를 입력받아 배열에 저장

        System.out.print("3의 배수는");
        for (int i = 0; i < 10; i++) {
            if ((n[i] % 3) == 0) System.out.print(" " + n[i]);
            else continue;
        }   // 3의 배수만 출력

        scanner.close();    // 스캐너 종료
    }
}
