package com.company;

import java.util.Scanner;

public class exam6_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        int n = scanner.nextInt();  // 게임에 참여할 선수 숫자를 입력
        Person person[] = new Person[n];    // 참여자 수만큼 Person 배열 생성
        for (int i = 0; i < person.length; i++) {
            System.out.print((i+1) + "번째 선수 이름>>");
            person[i] = new Person(scanner.next()); // 입력받은 이름으로 Person 객체 생성
        }

        String buffer = scanner.nextLine();     // 입력 스트림 비우기
        while (true){       // 누군가 승리할 때까지 반복
            for (int i = 0; i < person.length; i++) {   // 순서대로 돌아가면서 플레이
                System.out.print("[" + person[i].getName() + "]:<Enter>");
                buffer = scanner.nextLine();    // 엔터 입력
                if (person[i].turn()) {  // 난수 3개가 모두 일치하면 승리
                    System.out.println(person[i].getName() + "님이 이겼습니다!");
                    scanner.close();
                    return;
                }
                else System.out.println("아쉽군요!");
            }
        }
    }
}
