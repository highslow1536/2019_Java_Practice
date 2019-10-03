package com.company;

import java.util.Scanner;

public class exam4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];    // 3개의 Circle 배열 선언
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();    // x 값 읽기
            double y = scanner.nextDouble();    // y 값 읽기
            int radius = scanner.nextInt();     // 반지름 읽기
            c[i] = new Circle(x, y, radius);    // Circle 객체 생성
        }

        int maxIdx = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i].area() > c[maxIdx].area()) maxIdx = i;     // 가장 면적이 큰 원의 인덱스 찾기
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[maxIdx].show();

        scanner.close();
    }
}
