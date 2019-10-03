package com.company;

import java.util.Scanner;

class Seat{
    private String name;    // 예약자 이름을 나타내는 문자열
    public void set(String name) { this.name = name; }
    public String get() { return name; }
    public void show() {
        if (name == null) System.out.print("___");
        else System.out.print(name);
    }
}

class SeatManager{
    private Seat seat[];
    private String seatClass;

    public SeatManager(String seatClass){
        this.seatClass = seatClass;
        seat = new Seat[10];
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new Seat();
        }
    }

    public void view(){
        System.out.print(seatClass + ">> ");
        for (int i = 0; i < seat.length; i++) {
            seat[i].show();
            System.out.print(" ");
        }
        System.out.println();
    }

    public void reserve(){
        this.view();
        System.out.print("이름>>");
        String name = exam4_12.scanner.next();

        System.out.print("번호>>");
        int seatNum = exam4_12.scanner.nextInt();

        seat[seatNum-1].set(name);
    }

    public void cancel(){
        this.view();
        System.out.print("이름>>");
        String name = exam4_12.scanner.next();

        for (int i = 0; i < seat.length; i++) {
            if (name.equals(seat[i].get())){
                seat[i].set(null);
                return;
            }
        }
        System.out.println("예약되지 않은 사람입니다.");
    }

}

public class exam4_12 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SeatManager sClassSeats = new SeatManager("S");
        SeatManager aClassSeats = new SeatManager("A");
        SeatManager bClassSeats = new SeatManager("B");

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int syscommand = scanner.nextInt();
            if (syscommand == 1){
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int seatClass = scanner.nextInt();
                if (seatClass == 1) sClassSeats.reserve();
                else if (seatClass == 2) aClassSeats.reserve();
                else if (seatClass == 3) bClassSeats.reserve();
                else System.out.println("좌석을 잘못 선택하였습니다.");
            }
            else if (syscommand == 2){
                sClassSeats.view();
                aClassSeats.view();
                bClassSeats.view();
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            else if (syscommand == 3){
                System.out.print("좌석 S:1, A:2, B:3>>");
                int seatClass = scanner.nextInt();
                if (seatClass == 1) sClassSeats.cancel();
                else if (seatClass == 2) aClassSeats.cancel();
                else if (seatClass == 3) bClassSeats.cancel();
                else System.out.println("좌석을 잘못 선택하였습니다.");
            }
            else if (syscommand == 4){
                break;
            }
        }

        scanner.close();
    }
}
