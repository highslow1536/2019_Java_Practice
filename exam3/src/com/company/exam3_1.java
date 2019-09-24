package com.company;

public class exam3_1 {
    public static void main(String[] args) {
        int sum=0, i=0;     // int 형 변수 선언

        while (i < 100){
            sum = sum + i;
            i += 2;
        } // (2) while 문을 이용하여 sum을 계산함
        System.out.println(sum);

        sum = 0;
        for (i = 0; i < 100; i+=2) {
            sum = sum + i;
        } // (3) for 문을 이용하여 sum을 계산함
        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum = sum + i;
            i += 2;
        } while (i < 100);
        // (4) do-while 문을 이용하여 sum을 계산함
        System.out.println(sum);
    }
}
