package com.company;

import java.util.Calendar;

public class exam6_5 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);

        System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");
        if (4 <= hourOfDay && hourOfDay < 12){
            System.out.println("Good Morning");
        }
        else if (hourOfDay < 18){
            System.out.println("Good Afternoon");
        }
        else if (hourOfDay < 22){
            System.out.println("Good Evening");
        }
        else {
            System.out.println("Good Night");
        }
    }
}
