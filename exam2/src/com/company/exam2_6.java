package com.company;

import java.util.Scanner;

public class exam2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = scanner.nextInt();

        if (((num/10)==3)||((num/10)==6)||((num/10)==9) && ((num%10)==3)||((num%10)==6)||((num%10)==9)){
            System.out.println("박수짝짝");
        }
        else if (((num/10)==3)||((num/10)==6)||((num/10)==9) || ((num%10)==3)||((num%10)==6)||((num%10)==9)){
            System.out.println("박수짝");
        }

        scanner.close();
    }
}
