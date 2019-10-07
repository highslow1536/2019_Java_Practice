package com.company;

import java.util.Scanner;

interface Stack{
    int length();   // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    boolean push(String val);   // 스택의 톱(top)에 실수 저장
    String pop();   // 스택의 톱(top)에 저장된 실수 리턴
}

class StringStack implements Stack{  // StringStack 클래스 구현
    private String[] stack;
    private int top;
    private int stackSize;
    public StringStack(int size){
        this.stackSize = size;
        this.stack = new String[this.stackSize];
        this.top = -1;
    }
    @Override       // Stack interface 구현
    public int length() {   // length() 메소드 구현
        return this.top + 1;
    }
    @Override
    public int capacity() { // capacity() 메소드 구현
        return stackSize;
    }
    @Override
    public boolean push(String val) {   // push() 메소드 구현
        if (top == (stackSize-1)) {
            return false;
        }
        else {
            stack[++top] = val;
            return true;
        }
    }
    @Override
    public String pop() {   // pop() 메소드 구현
        if (top == -1){
            System.out.println("스택이 텅 비었습니다!");
            return null;
        }
        else {
            return stack[top--];
        }
    }
}

public class exam5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = scanner.nextInt();
        StringStack stringStack = new StringStack(size);

        while (true){       // "그만"을 입력받을 때까지 반복
            System.out.print("문자열 입력 >> ");
            String string = scanner.next();
            if (string.equals("그만")) break;
            if (!stringStack.push(string)) System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.println("스택에 저장된 모든 문자열 팝 : ");
        int stackLen = stringStack.length();
        for (int i = 0; i < stackLen; i++) {
            System.out.print(stringStack.pop() +  " ");
        }

        scanner.close();
    }
}
