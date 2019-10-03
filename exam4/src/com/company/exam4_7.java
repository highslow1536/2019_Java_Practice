package com.company;

import java.util.Scanner;

class Day {
    private String work;    // 하루의 할 일을 나타내는 문자열
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

class MonthSchedule {
    private Day day[];      // Day 객체 배열
    private int selectMenu = 0;
    private Scanner scanner;

    public MonthSchedule(int numOfDay){
        day = new Day[numOfDay+1];      // 관리하기 쉽게 index를 numOfDay까지 만듦
        for (int i = 0; i < day.length; i++) {
            day[i] = new Day();     // Day 객체 생성
        }
    }
    public void input(){        // 스케쥴 입력을 위한 메소드
        System.out.print("날짜(1~30)?");
        int dIdx = scanner.nextInt();

        System.out.print("할일(빈칸없이 입력)?");
        String todo = scanner.next();
        day[dIdx].set(todo);
    }
    public void view(){     // 스케쥴 보기를 위한 메소드
        System.out.print("날짜(1~30)?");
        int dIdx = scanner.nextInt();

        System.out.print(dIdx + "일의 할 일은 ");
        day[dIdx].show();
    }
    public void finish(){       // 끝내기를 위한 메소드
        System.out.println("프로그램을 종료합니다.");
    }
    public void run(){      // 메뉴를 출력, 처리하는 메소드
        this.scanner = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while (selectMenu != 3) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            selectMenu = scanner.nextInt();

            if (selectMenu == 1) input();
            else if (selectMenu == 2) view();
            else if (selectMenu == 3) finish();
            else System.out.println("잘못입력했습니다.");
            System.out.println();
        }

        this.scanner.close();
    }
}

public class exam4_7 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);    // 4월달의 할 일
        april.run();        // 스케쥴 관리 프로그램 실행

    }
}
