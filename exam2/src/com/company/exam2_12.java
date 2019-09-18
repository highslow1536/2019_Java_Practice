package com.company;

import java.util.Scanner;

public class exam2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        double n1 = scanner.nextDouble();
        String cal = scanner.next();
        double n2 = scanner.nextDouble();

        // if-else 문을 이용하여 작성
        if (cal.equals("+")) System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1+n2));
        else if (cal.equals("-")) System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1-n2));
        else if (cal.equals("*")) System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1*n2));
        else if (cal.equals("/")) {
            if (n2 == 0) System.out.println("0으로 나눌 수 없습니다.");
            else System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1/n2));
        }
        else System.out.println("잘못입력");
/*
        // switch 문을 이용하여 작성
        switch (cal){
            case "+":
                System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1+n2));
                break;
            case "-":
                System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1-n2));
                break;
            case "*":
                System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1*n2));
                break;
            case "/":
                if (n2 == 0) System.out.println("0으로 나눌 수 없습니다.");
                else System.out.println(n1+cal+n2+"의 계산 결과는 "+(n1/n2));
                break;
            default:
                System.out.println("잘못입력");
                break;
        }
*/
        scanner.close();
    }
}
