package com.company;

import java.util.Scanner;

public class exam3_6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        // 환산할 돈의 종류
        Scanner scanner = new Scanner(System.in);   // 스캐너 시작

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();  // 금액을 입력받는다

        for (int i = 0; i < 8; i++) {
            int count = money / unit[i];    // 각 돈의 갯수
            if (count != 0) {       // 갯수가 1개 이상인 것만 출력
                System.out.println(unit[i] + "원 짜리 : " + count + "개");
            }
            money %= unit[i];   // 카운트 해준 만큼 money에서 빼준다
        }

        scanner.close();    // 스캐너 종료
    }
}
