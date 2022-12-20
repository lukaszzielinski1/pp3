public class Triangle extends Shape {
    private int a;
    private int h;
    private int b;
    private int c;

    public int getA() {
        return a;
    }
    public int getH() {
        return h;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }
    double area(){
        return (a*h)/2;
    }
    double perimeter(){
        return a+b+c;
    }
}
