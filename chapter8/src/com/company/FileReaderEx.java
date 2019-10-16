package com.company;

import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
//            fin = new FileReader("c:\\windows\\system.ini");    // 문자 입력 스트림 생성
            fin = new FileReader("C:\\Users\\highslow12\\Documents\\2019_Java\\chapter8\\src\\com\\company\\FileReaderEx.java");
            int c;
            int lineNum = 1;
            System.out.print(lineNum + " ");
            while ((c = fin.read()) != -1) {    // 한 문자씩 파일 끝까지 읽는다.
                System.out.print((char)c);
                if (c == '\n'){
                    lineNum++;
                    System.out.print(lineNum + " ");
                }
            }
            fin.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}