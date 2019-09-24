package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class exam3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 스캐너 시작
        System.out.print("정수 몇개?");
        int n = scanner.nextInt();  // n값을 입력받는다
        int list[] = new int[n];    // 정수 배열 생성

        int count = 0;      // 이쁘게 출력하기 위한 변수
        int i = 0;
        while (i < n){    // 배열을 꽉 채울때까지 반복
            int tmp = (int)(Math.random()*100 + 1); // 1~100 랜덤수 생성
            Arrays.sort(list);  // binarySearch를 이용하기 위한 과정
            if (Arrays.binarySearch(list, tmp) < 0) {   // 랜덤수가 배열에 없는 경우
                if (count == 10) {  // 10개씩 나오고 줄바꿈
                    System.out.println();
                    count = 0;
                }
                list[i] = tmp;  // 배열에 랜덤수 추가
                System.out.print(list[i] + " ");    // 새 원소 출력
                count++;
                i++;        // 배열 index 증가
            }
        }
        scanner.close();    // 스캐너 종료
    }
}
