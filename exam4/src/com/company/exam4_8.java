package com.company;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName() { return name; }
    public String getTel() { return tel; }
}

public class exam4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>>");
        int n = scanner.nextInt();
        Phone phone[] = new Phone[n];
        for (int i = 0; i < phone.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while (true){
            System.out.print("검색할 이름>>");
            String search = scanner.next();
            if (search.equals("그만")) break;

            int i;
            for (i = 0; i < phone.length; i++) {
                if (phone[i].getName().equals(search)){
                    System.out.println(search + "의 번호는 " + phone[i].getTel() + " 입니다.");
                    break;
                }
            }
            if (i == phone.length) System.out.println(search + " 이 없습니다.");
        }

        scanner.close();
    }
}
