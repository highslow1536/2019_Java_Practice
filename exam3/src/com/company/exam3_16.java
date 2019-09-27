package com.company;

import java.util.Scanner;

public class exam3_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};

        while (true) {
            System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
            System.out.print("가위 바위 보!>>");
            String you = scanner.next();
            if (you.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            int n = (int) (Math.random() * 3);
            String com = str[n];

            System.out.print("사용자 = " + you + " , 컴퓨터 = " + com + ", ");
            if (you.equals(com)) System.out.println("비겼습니다.");
            else if (you.equals("가위")){
                if (com.equals("보")) System.out.println("사용자가 이겼습니다.");
                else System.out.println("컴퓨터가 이겼습니다.");
            }
            else if (you.equals("바위")){
                if (com.equals("가위")) System.out.println("사용자가 이겼습니다.");
                else System.out.println("컴퓨터가 이겼습니다.");
            }
            else if (you.equals("보")){
                if (com.equals("바위")) System.out.println("사용자가 이겼습니다.");
                else System.out.println("컴퓨터가 이겼습니다.");
            }
        }

        scanner.close();
    }
}
