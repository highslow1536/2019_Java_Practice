package com.company;

public class exam3_2 {
    public static void main(String[] args) {
        int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        // int형 2차원 배열 n을 생성, 초기화

        for (int i = 0; i < 5; i++) {   // i행의 원소 접근
            for (int j = 0; j < n[i].length; j++) { // n[i]의 원소 개수만큼 반복
                System.out.print(n[i][j] + " ");    // i행 j열의 원소 출력
            }
            System.out.println();   // 한 행이 끝나면 줄바꿈
        }
    }
}
