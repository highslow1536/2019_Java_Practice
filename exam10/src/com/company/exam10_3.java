package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class exam10_3 extends JFrame {
    private JLabel label;
    private String text = "Love Java";
    StringBuffer s = new StringBuffer("Love Java");

    public exam10_3(){
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        label = new JLabel("Love Java");
        label.addKeyListener(new MyKeyAdapter());
        label.setSize(200, 50); // label의 크기 설정
        c.add(label);   // 컨텐트팬에 label 추가

        setSize(400, 200);
        setVisible(true);
        label.requestFocus();
    }

    class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(label.getText().equals("Love Java")) { // "Love Java"일 때
                        label.setText(s.reverse().toString());
                        // s.reverse()를 하면 따로 변수에 담지 않아도 s 자체가 바뀜
                    }
                    else {
                        label.setText(s.reverse().toString());
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new exam10_3();
    }
}
