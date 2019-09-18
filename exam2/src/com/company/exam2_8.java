package com.company;

import java.util.Scanner;

public class exam2_8 {

    // 사각형이 서로 충돌하지 않는 경우만 따져보고 충돌여부 판정
    // 끝과 끝을 대소관계 잘 비교하면 됨
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(x1, y1), (x2, y2)를 입력하시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean isCrash = true;
        if (x2 < 100) isCrash = false;  // 기준 직사각형보다 왼쪽에 있는 경우
        if (x1 > 200) isCrash = false;  // 기준 직사각형보다 오른쪽에 있는 경우
        if (y1 > 200) isCrash = false;  // 기준 직사각형보다 위에 있는 경우
        if (y2 < 100) isCrash = false;  // 기준 직사각형보다 아래에 있는 경우

        System.out.println(isCrash?"충돌":"충돌안해요");

        scanner.close();
    }
}
