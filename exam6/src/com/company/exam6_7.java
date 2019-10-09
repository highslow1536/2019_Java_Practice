package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exam6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){       // StringTokenizer 클래스를 이용하여 작성
            System.out.print(">>");
            String sentence = scanner.nextLine();
            if (sentence.equals("그만")){
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(sentence, " ");
            System.out.println("어절 개수는 " + st.countTokens());
        }

        while (true){       // String 클래스의 split() 메소드를 이용하여 작성
            System.out.print(">>");
            String sentence = scanner.nextLine();
            if (sentence.equals("그만")){
                System.out.println("종료합니다...");
                break;
            }
            String s[] = sentence.split(" ");
            System.out.println("어절 개수는 " + s.length);
        }
        scanner.close();
    }
}
