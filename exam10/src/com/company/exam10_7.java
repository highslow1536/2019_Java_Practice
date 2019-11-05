package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class exam10_7 extends JFrame {
    JLabel label;
    public exam10_7(){
        setTitle("마우스 휠을 굴려 폰트 크기 수정 응용프로그램"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기

        label= new JLabel("Love Java");
        label.setSize(200,50);
        label.setFont(new Font("Arial",Font.PLAIN,10));
        // Arial 폰트로 10픽셀 크기

        label.addMouseWheelListener(new MyMouseWheelListener());
        // Jabel 컴포넌트 생성 후 MouseListener를 단다.

        add(label);
        setSize(400,200);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
    }

    class MyMouseWheelListener implements MouseWheelListener {
        Font f;
        int size; // label의 font size 구하기
        int n;
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            f = label.getFont();
            size =f.getSize();
            n = e.getWheelRotation();
            if(n<0 && size>5) // up direction. 폰트 5픽셀 작게
                label.setFont(new Font("Arial", Font.PLAIN,size-5));
            else // down direction. 폰트 5픽셀 크게
                label.setFont(new Font("Arial", Font.PLAIN,size+5));
        }
    }

    public static void main(String[] args) {
        new exam10_7();
    }
}
