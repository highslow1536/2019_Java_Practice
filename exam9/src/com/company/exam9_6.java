package com.company;

import javax.swing.*;
import java.awt.*;

public class exam9_6 extends JFrame {
    public exam9_6(){
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for (int i = 0; i < 20; i++) {
            int x = (int)(Math.random()*200) + 50;  // 50~250
            int y = (int)(Math.random()*200) + 50;  // 50~250

            JLabel label = new JLabel();    // JLabel 생성
            label.setLocation(x, y);    // label을 (x,y)에 배치
            label.setSize(10, 10);  // label 크기를 10x10으로 설정
            label.setBackground(Color.BLUE);    // 라벨의 배경색을 파란색으로 설정
            label.setOpaque(true);  // label에 배경색이 보이게 함

            c.add(label);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new exam9_6();
    }
}
