package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class exam10_1 extends JFrame {
    private JLabel label = new JLabel("사랑해");   // 텍스트를 출력하기 위한 라벨

    public exam10_1(){
        setTitle("마우스 올리기 내리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        label.addMouseListener(new MyMouseAdapter());   // label에 Mouse 이벤트 리스너 달기
        label.setSize(200, 50); // label의 크기 설정
        c.add(label);   // 컨텐트팬에 label 추가

        setSize(400, 200);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent e) {
            label.setText("Love Java"); // 마우스가 라벨 안에 들어왔을때
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setText("사랑해");   // 마우스가 라벨을 벗어났을 때
        }
    }

    public static void main(String[] args) {
        new exam10_1();
    }
}
