public class SurfaceArea{

    static double circle(int r){
        return 3.14*(r^2);
    }
    
    static double rectangle(int a, int b){
        return a*b;
    }
    
    static double triangle(int a, int h){
        return (a*h)/2.0;
    }
    
    public static void main(String[] args){
        System.out.println("Circle area: " + circle(5));
        System.out.println("Rectangle area: " + rectangle(4,2));
        System.out.println("Triangle area: " + triangle(4,7));
    }
}