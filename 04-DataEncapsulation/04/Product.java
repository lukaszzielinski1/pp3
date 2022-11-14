
public class Product{
    private String name;
    private boolean vegetarian;
    
    String getName(){
        return name;
    }
    
    boolean getVegetarian(){
        return vegetarian;
    }
    
    void setName(String n ){
        this.name = n;
    }
    
    void setVegetarian(boolean v){
        this.vegetarian = v;
    }
    
    public String toString(){
            return "Name: " + getName() + "\n" + "Vegetarian: " + vegetarian + "\n";
    }
    
    public static void main(String[] args){
        Product p = new Product();
        p.setName("Samochod");
        p.setVegetarian(false);
        System.out.println(p);
    }
}