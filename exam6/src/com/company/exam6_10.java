package com.company;

import java.util.Scanner;

class Person{   // 갬블링 게임의 참여자
    private String name;
    private int n1, n2, n3;

    public Person(String name){     // 생성자
        this.name = name;
    }
    public String getName() { return name; }    // 이름 리턴하는 메소드
    public boolean turn(){  // 난수 3개 생성 후, 모두 일치하면 true 리턴하는 메소드
        n1 = (int)(Math.random()*3 + 1);
        n2 = (int)(Math.random()*3 + 1);
        n3 = (int)(Math.random()*3 + 1);
        System.out.printf("\t %d  %d  %d  ", n1, n2, n3);
        if (n1==n2 && n2==n3) return true;
        else return false;
    }
}

public class exam6_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1번째 선수 이름>>");
        Person person1 = new Person(scanner.next());    // 이름 입력
        System.out.print("2번째 선수 이름>>");
        Person person2 = new Person(scanner.next());    // 이름 입력

        String buffer = scanner.nextLine();     // 입력 스트림 비우기
        while (true){
            System.out.print("[" + person1.getName() + "]:<Enter>");
            buffer = scanner.nextLine();
            if (person1.turn()){    // person1의 난수 3개가 모두 일치한 경우
                System.out.println(person1.getName() + "님이 이겼습니다!");
                break;
            }
            else System.out.println("아쉽군요!");

            System.out.print("[" + person2.getName() + "]:<Enter>");
            buffer = scanner.nextLine();
            if (person2.turn()){    // person2의 난수 3개가 모두 일치한 경우
                System.out.println(person2.getName() + "님이 이겼습니다!");
                break;
            }
            else System.out.println("아쉽군요!");
        }
        scanner.close();
    }
}
