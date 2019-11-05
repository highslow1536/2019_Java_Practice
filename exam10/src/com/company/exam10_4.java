package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class exam10_4 extends JFrame {
    private JLabel label;
    private String text = "Love Java";

    public exam10_4(){
        setTitle("Left 키로 문자열 이동");
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
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) { // 입력받은 코드가
                case KeyEvent.VK_LEFT: //<Left> 키 일때
                    label.setText(text); // text 한칸씩 앞으로 당김
                    text = text.substring(1)+text.substring(0, 1);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new exam10_4();
    }
}
