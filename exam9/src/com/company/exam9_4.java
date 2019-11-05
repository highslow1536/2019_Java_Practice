package com.company;

import javax.swing.*;
import java.awt.*;

public class exam9_4 extends JFrame {
    public exam9_4(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1x10 격자의 GridLayout 배치관리자 설정
        GridLayout grid = new GridLayout(1, 10);

        Container c = getContentPane(); // grid를 컨탠트팬의 배치관리자로 지정
        c.setLayout(grid);

        // 반복문을 이용하기 위해 Color 배열 생성
        Color color[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
                Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
        for (int i = 0; i < 10; i++) {  // JButton 10개 생성
            String name = Integer.toString(i);
            JButton button = new JButton(name);
            button.setBackground(color[i]); // 버튼의 배경색 설정
            button.setOpaque(true);
            c.add(button);
        }

        setSize(500, 200);  // 프레임 크기 500x200 설정
        setVisible(true);   // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        new exam9_4();
    }
}
