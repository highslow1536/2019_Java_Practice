package com.company;

class Sample {
    public int a;
    protected int b;
    int c;
}

public class AccessEx {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 10;
        sample.b = 10;
        sample.c = 10;
    }
}
