package com.company;

import javax.swing.*;
import java.awt.*;

public class exam9_3 extends JFrame {
    public exam9_3(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1x10 격자의 GridLayout 배치관리자 생성
        GridLayout grid = new GridLayout(1, 10);

        Container c = getContentPane();
        c.setLayout(grid);  // grid를 컨텐트팬의 배치관리자로 지정
        for (int i = 0; i < 10; i++) {
            Integer num = i;
            c.add(new JButton(num.toString())); // JButton 10개 생성
        }

        setSize(500, 200);  // 프레임 크기 500x200 설정
        setVisible(true);   // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        new exam9_3();
    }
}
