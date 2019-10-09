package com.company;

import java.util.Scanner;

public class exam6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String s = scanner.nextLine();  // 한 줄 입력

        for (int i = 0; i < s.length(); i++) {  // 문자열 s의 길이만큼 반복
            s = s.substring(1) + s.charAt(0);   // 맨 앞의 글자를 맨 뒤에 붙임
            System.out.println(s);      // 바뀐 s 출력
        }
        scanner.close();
    }
}
