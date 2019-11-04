package com.company;

import javax.swing.*;
import java.awt.*;

public class exam9_2 extends JFrame {
    public exam9_2(){
        setTitle("BorderLayout Practice");  // 프레임 타이틀 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // 컨텐트팬에 BorderLayout 배치관리자 설정
        c.setLayout(new BorderLayout(5, 7));

        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("Center"), BorderLayout.CENTER);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("South"), BorderLayout.SOUTH);

        setSize(400, 200);  // 프레임 크기 400x200 설정
        setVisible(true);   // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        new exam9_2();
    }
}
