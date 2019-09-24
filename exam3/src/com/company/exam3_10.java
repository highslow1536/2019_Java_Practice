package com.company;

public class exam3_10 {
    public static void main(String[] args) {
        int n[][] = new int[4][4];  // 4X4 배열 생성
        for (int i = 0; i < 10; i++) {
            int tmp = (int)(Math.random()*10 + 1);  // 랜덤수 생성
            while (true){   // 랜덤수 집어넣을 위치 찾는 과정
                int idx = (int)(Math.random()*4);   // 랜덤 인덱스
                int idy = (int)(Math.random()*4);   // 랜덤 인덱스
                if (n[idx][idy] == 0){  // 이미 넣은 위치인 경우
                    n[idx][idy] = tmp;  // 랜덤수 삽입
                    break;      // 다음 랜덤수로 넘어가기
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(String.format("%-5d", n[i][j]));
            }   // 포맷팅으로 예쁘게 출력
            System.out.println();   // 줄바꿈
        }
    }
}
