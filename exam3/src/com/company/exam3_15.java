package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.print(n + "x" + m + "=" + n*m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine();     // 이미 입력된 키 모두 제거
            }
        }

        scanner.close();
    }
}
