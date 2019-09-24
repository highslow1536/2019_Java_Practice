package com.company;

public class exam3_12 {
    public static void main(String[] args) {
        int sum = 0;    // sum 변수 선언

        for (int i = 0; i < args.length; i++) { // 인자 개수만큼 반복
            try {   // 매개변수가 정수면 처리됨
                sum += Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e){
                continue;   // 정수가 아닌경우 패스
            }
        }

        System.out.println(sum);    // 정수만의 합 출력
    }
}
