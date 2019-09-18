package com.company;

import java.util.Scanner;

public class exam2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r = scanner.nextDouble();

        System.out.print("점 입력>>");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (r*r >= ((x-x1)*(x-x1) + (y-y1)*(y-y1))){
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        }
        else {
            System.out.println("점 (" + x + ", " + y + ")는 원 밖에 있다.");
        }

        scanner.close();
    }
}
