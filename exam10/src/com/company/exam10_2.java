package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class exam10_2 extends JFrame {
    Container c = getContentPane();

    public exam10_2(){
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setBackground(Color.GREEN);   // 기본 배경색상 초록으로 설정
        c.addMouseMotionListener(new MyMouseAdapter()); // Mouse 모션 이벤트 리스너 달기
        c.addMouseListener(new MyMouseAdapter());   // Mouse 이벤트 리스너 달기

        setSize(400, 200);  //
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter{  // MouseAdapter를 상속받아 클래스 작성
        @Override
        public void mouseDragged(MouseEvent e) {
            c.setBackground(Color.YELLOW);  // 마우스가 드래깅 중일때
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new exam10_2();
    }
}
