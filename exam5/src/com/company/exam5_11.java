package com.company;

import java.util.Scanner;

abstract class Calc{    // 추상 클래스 Calc 작성
    private int a;
    private int b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getA() { return a; }
    public int getB() { return b; }
    public abstract int calculate();
}

class Add extends Calc{     // 덧셈
    @Override
    public int calculate() {    // 추상 메소드 calculate 구현
        return getA() + getB();
    }
}
class Sub extends Calc{     // 뺄셈
    @Override
    public int calculate() {
        return getA() - getB();
    }
}
class Mul extends Calc{     // 곱셈
    @Override
    public int calculate() {
        return getA() * getB();
    }
}
class Div extends Calc{     // 나눗셈
    @Override
    public int calculate() {
        return getA() / getB();
    }
}

public class exam5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String cal = scanner.next();

        switch (cal){   // 각 연산자에 따른 계산 수행
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;
            default:
                System.out.println("잘못입력했습니다.");
                break;
        }
        scanner.close();
    }
}
