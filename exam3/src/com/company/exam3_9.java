package com.company;

public class exam3_9 {
    public static void main(String[] args) {
        int n[][] = new int[4][4];  // 4X4 배열 생성

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j] = (int)(Math.random()*10 + 1);  // 랜덤수 생성
                System.out.print(String.format("%-5d", n[i][j]));  // 정수 출력
            }
            System.out.println();   // 한 행이 끝날때마다 줄바꿈
       }
    }
}
