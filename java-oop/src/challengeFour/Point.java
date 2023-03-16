package challengeFour;

import java.lang.Math;

class Point {
    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(){
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }
    public double distance(int x2, int y2){
        double distance = Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
        return distance;
    }
}

class Demo{
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2,1));
    }
}