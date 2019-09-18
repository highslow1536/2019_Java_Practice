package com.company;

import java.util.Scanner;

public class exam2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        int won5man = money / 50000;
        money %= 50000;
        int won1man = money / 10000;
        money %= 10000;
        int won1cheon = money / 1000;
        money %= 1000;
        int won5baek = money / 500;
        money %= 500;
        int won1baek = money / 100;
        money %= 100;
        int won5sib = money / 50;
        money %= 50;
        int won1sib = money / 10;
        money %= 10;
        int won1won = money;

        if (won5man != 0) System.out.println("오만원권 " + won5man + "매");
        if (won1man != 0) System.out.println("만원권 " + won1man + "매");
        if (won1cheon != 0) System.out.println("천원권 " + won1cheon + "매");
        if (won5baek != 0) System.out.println("오백원 " + won5baek + "개");
        if (won1baek != 0) System.out.println("백원 " + won1baek + "개");
        if (won5sib != 0) System.out.println("오십원 " + won5sib + "개");
        if (won1sib != 0) System.out.println("십원 " + won1sib + "개");
        if (won1won != 0) System.out.println("일원 " + won1won + "개");
        scanner.close();
    }
}
