package com.company;

import java.util.Calendar;
import java.util.Scanner;

class Player{   // 게임의 플레이어를 만드는 클래스
    Scanner scanner;
    Calendar now;
    private String name;
    private String buffer;
    private int sec1, sec2;

    public Player(String name){     // 생성자
        this.name = name;
    }
    public String getName() { return name; }    // 이름을 반환하는 메소드
    public int play(){  // 게임을 실행한 뒤, 결과를 반환하는 메소드
        scanner = new Scanner(System.in);
        System.out.print(name + " 시작 <Enter>키>>");
        sec1 = enter();     // 엔터 입력 받기
        System.out.print("10초 예상 후 <Enter>키>>");
        sec2 = enter();     // 엔터 입력 받기

        if (sec1 <= sec2) return sec2 - sec1;
        else return (60+sec2) - sec1;   // 60초가 되어 0초로 초기화 돼서 sec1이 더 큰 상황
    }
    public int enter(){     // Enter키를 누르면 현재 초 시간을 반환하는 메소드
        buffer = scanner.nextLine();
        now = Calendar.getInstance();
        System.out.println("\t현재 초 시간 = " + now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }
}

public class exam6_6 {
    public static void main(String[] args) {
        Player player1 = new Player("황기태");
        Player player2 = new Player("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        while (true) {
            int result1 = player1.play();
            int result2 = player2.play();

            System.out.printf("%s의 결과 %d, %s의 결과 %d, ", player1.getName(), result1, player2.getName(), result2);
            if (Math.abs(10 - result1) < Math.abs(10 - result2)) {   // player1이 더 10초에 근접한 경우
                System.out.println("승자는 " + player1.getName());
                break;
            } else if (Math.abs(10 - result1) > Math.abs(10 - result2)) {  // player2가 더 10초에 근접한 경우
                System.out.println("승자는 " + player2.getName());
                break;
            } else System.out.println("비겼습니다. 다시 시작 \n");
        }
    }
}
