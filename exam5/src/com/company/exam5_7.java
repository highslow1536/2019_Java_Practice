package com.company;

class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp() { this.z++; }
    public void moveDown(){ this.z--; }
    protected void move(int x, int y, int z){
        super.move(x, y);
        this.z = z;
    }
    public String toString(){
        return "(" + getX() + "," + getY() + "," + this.z + ")의 점";
    }
}

public class exam5_7 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3); // 1, 2, 3은 각각 x, y, z축의 값.
        System.out.println(p.toString() + "입니다.");

        p.moveUp(); // z 축으로 위쪽 이동
        System.out.println(p.toString() + "입니다.");

        p.moveDown();   // z 축으로 아래쪽 이동
        p.move(10, 10); // x, y 축으로 이동
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);  // x, y, z 축으로 이동
        System.out.println(p.toString() + "입니다.");
    }
}
