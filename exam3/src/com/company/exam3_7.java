package com.company;

public class exam3_7 {
    public static void main(String[] args) {
        int n[] = new int[10];  // 정수 10개의 배열 생성

        for (int i = 0; i < 10; i++) {
            n[i] = (int)(Math.random()*10 + 1);
        }   // 1~10 범위 정수 랜덤 생성, 배열에 저장

        int sum = 0;    // sum 변수 선언, 초기화
        System.out.print("랜덤한 정수들 :");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + n[i]);
            sum += n[i];
        }   // 배열에 든 숫자들 출력, sum 계산
        double average = sum / 10.0;    // 평균 계산
        System.out.print("\n평균은 " + average);
    }
}
