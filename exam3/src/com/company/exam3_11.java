package com.company;

public class exam3_11 {
    public static void main(String[] args) {
        int sum = 0;    // sum 변수 선언

        for (int i = 0; i < args.length; i++) { // 인자 개수만큼 반복
            sum += Integer.parseInt(args[i]);   // 정수타입으로 변환하여 합산
        }

        double average = (double)sum / args.length; // 평균 계산
        System.out.println(average);    // 평균 출력
    }
}
