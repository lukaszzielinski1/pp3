public class Circle extends Shape {
    private int r;
    private double pi = 3.14;;

    Circle(int r){
        this.r = r;
    }
    @Override
    double area() {
        return pi*(r*r);
    }
    double perimeter(){
        return 2*pi*r;
    }
    
}
