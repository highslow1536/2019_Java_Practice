package com.company;

import javax.swing.*;

public class exam9_1 extends JFrame {
    public exam9_1(){
        setTitle("Let's study Java");   // 프레임 타이틀 설젇
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 200);  // 프레임 크기 400x200 설정
        setVisible(true);   // 프레임 출력
    }

    public static void main(String[] args) {
        exam9_1 app = new exam9_1();
    }
}
