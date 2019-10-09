package com.company;

import java.util.Scanner;

class Human{
    private String name;
    Scanner scanner = new Scanner(System.in);
    public Human(String name){
        this.name = name;
    }
    public String getName() { return name; }    // 이름 반환 메소드
    public int turn(){  // 사람의 입력을 받는 메소드
        System.out.print(name + "[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        return scanner.nextInt();
    }
}

class Computer extends Human{
    public Computer() {
        super("컴퓨터");
    }
    @Override
    public int turn() { // 컴퓨터는 가위, 바위, 보 중 랜덤으로 냄
        return (int)(Math.random()*3 + 1);
    }
}

public class exam6_9 {
    private Human user;
    private Computer computer;
    private final String rsp[] = {"가위", "바위", "보"};

    public exam6_9(String userName){
        user = new Human(userName);
        computer = new Computer();
    }
    public void run(){  // 가위바위보 게임을 실행하는 메소드
        while (true){
            int userRSP = user.turn();  // 철수 차례
            if (userRSP == 4) break;    // 게임 끝내기
            else if (userRSP < 1 || 4 < userRSP){
                System.out.println("잘못입력했습니다.");
                continue;
            }
            int comRSP = computer.turn();   // 컴퓨터 차례
            System.out.printf("%s(%s) : %s(%s) \n", user.getName(), rsp[userRSP-1], computer.getName(), rsp[comRSP-1]);

            int diff = userRSP - comRSP;
            switch (diff){
                case 0: // 같은 패를 낸 경우
                    System.out.println("비겼습니다.");
                    break;
                case 1: // 철수가 이긴 경우
                case -2:
                    System.out.println(user.getName() + "가 이겼습니다.");
                    break;
                case -1:    // 컴퓨터가 이긴 경우
                case 2:
                    System.out.println(computer.getName() + "가 이겼습니다.");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        exam6_9 rspGame = new exam6_9("철수");    // 사용자이름 철수로 설정
        rspGame.run();      // 가위바위보 게임 실행
    }
}
