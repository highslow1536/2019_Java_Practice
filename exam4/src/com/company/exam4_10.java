package com.company;

import java.util.Scanner;

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };
    public static String kor2Eng(String word) {
        /* 검색 코드 작성 */
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) return eng[i];
        }
        return "저의 사전에 없습니다.";
    }
}

public class exam4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한영 단어 검색 프로그램입니다.");
        while (true){
            System.out.print("한글 단어?");
            String word = scanner.next();
            if (word.equals("그만")) break;
            System.out.println(word + "은 " + Dictionary.kor2Eng(word));
        }

        scanner.close();
    }
}
