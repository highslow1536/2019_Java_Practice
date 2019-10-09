package com.company;

import java.util.Scanner;

public class exam6_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        StringBuffer sentence = new StringBuffer(scanner.nextLine());

        while (true) {
            System.out.print("명령: ");
            String cmd = scanner.next();
            if (cmd.equals("그만")){
                System.out.println("종료합니다");
                break;
            }
            String token[] = cmd.split("!");
            if (token.length != 2) System.out.println("잘못된 명령입니다!");
            else {
                if (token[0].length() == 0 || token[1].length() == 0){
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }
                int index = sentence.indexOf(token[0]);
                if (index == -1){
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sentence.replace(index, index+token[0].length(), token[1]);
                System.out.println(sentence);
            }
        }
        scanner.close();
    }
}
