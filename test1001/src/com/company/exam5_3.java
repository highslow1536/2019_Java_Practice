package com.company;
class Pen{
    private int amount;
    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
}
class SharpPencil extends Pen{
    private int width;
}
class BallPen extends SharpPencil{
    private String color;
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
class FountainPen extends BallPen{
    public void refill(int n) { setAmount(n); }
}

public class exam5_3 {
}
