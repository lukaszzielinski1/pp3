public class Rectangles{
    int length;
    int width;
    
    public void showInfo(){
        int perimeter = (length*2) + (width*2);
        System.out.println("Rectangle dimensions: " + length + "x" + width);
        System.out.println("Rectangle perimeter: " + perimeter);
        System.out.println("Rectangle surface area: " + length*width);
    }
}