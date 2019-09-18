package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class exam2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];

        System.out.print("정수 3개를 입력하시오>>");
        for (int i = 0; i < 3; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);
        if (num[1]+num[2] > num[0]){
            System.out.println("삼각형이 됩니다");
        }
        else {
            System.out.println("삼각형이 안됩니다");
        }

        scanner.close();
    }
}
