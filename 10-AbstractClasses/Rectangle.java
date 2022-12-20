public class Rectangle extends Shape {
    private int a;
    private int b;

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    double area(){
        return a*b;
    }

    double perimeter(){
        return a*2 + b*2;
    }
}
