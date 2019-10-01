package com.company;

class TV{
    private int size;
    public TV(int n) {size = n;}
}
class ColorTV extends TV{
    private int colors;
    public ColorTV(int colors, int size){
        super(size);
        this.colors = colors;
    }
}

public class Main {

    public static void main(String[] args) {
        ColorTV tv = new ColorTV(3, 2);
    }
}
