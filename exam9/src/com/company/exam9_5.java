package com.company;

import javax.swing.*;
import java.awt.*;

public class exam9_5 extends JFrame {
    public exam9_5(){
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4x4 격자의 GridLayout 배치관리자 설정
        GridLayout grid = new GridLayout(4, 4);

        Container c = getContentPane();
        c.setLayout(grid);

        // 반복문을 이용하기 위해 Color 배열 생성
        Color color[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
                Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
                Color.WHITE, Color.BLACK, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA };
        for (int i = 0; i < 16; i++) {  // JLabel 16개 생성
            JLabel label = new JLabel(i+"");
            label.setBackground(color[i]);  // 버튼의 배경색 설정
            label.setOpaque(true);
            c.add(label);
        }

        setSize(500, 200);  // 프레임 크기 500x200 설정
        setVisible(true);   // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        new exam9_5();
    }
}
