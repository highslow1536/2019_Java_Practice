package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class exam2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[3];

        System.out.print("정수 3개 입력>>");
        for (int i=0; i<3; i++){
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("중간 값은 " + nums[1]);

        scanner.close();
    }
}
