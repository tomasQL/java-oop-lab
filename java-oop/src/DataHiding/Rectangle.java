package DataHiding;

public class Rectangle {

    private int length, width;
    // D.C
    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }
    // P.C
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return this.length * this.width;
    }
}
class Demo {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2,2);
        System.out.println(obj.getArea());
    }
}
