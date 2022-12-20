public abstract class Shape {
    abstract double area();
    abstract double perimeter();

    public static void main(String[] args) {
        Shape r = new Rectangle(5,16);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        Shape t = new Triangle(6,5);
        System.out.println(t.area());
        System.out.println(t.perimeter());
        Shape c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}