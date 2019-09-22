package com.company;

import java.util.Scanner;

public class exam3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int[10];

        System.out.print("양의 정수 10개를 입렧하시오>>");
        for (int i = 0; i < 10; i++) {
            n[i] = scanner.nextInt();
        }

        System.out.print("3의 배수는");
        for (int i = 0; i < 10; i++) {
            if ((n[i] % 3) == 0) System.out.print(" " + n[i]);
            else continue;
        }

        scanner.close();
    }
}
