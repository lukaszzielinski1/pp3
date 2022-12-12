import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> products = new ArrayList<Product>();
    private String a = "";

    public String getA() {
        return a;
    }

    void add(Product product){
        this.a = "";
        products.add(product);
        for(int i = 0; i< products.size();i++){
            if(i<products.size()-1){
                a+=products.get(i).getName()+",";
            }else if(i==products.size()-1){
                a+=products.get(i).getName();
            }
        }
    }

    int total(){
        int counter=0;
        for(int i =0; i<products.size();i++){
            counter+= products.get(i).getQuantity();
        }
        return counter;
    }

    public String toString(){
        return this.a;
    }

    public static void main(String[] args) {
        ShoppingList s = new ShoppingList();
        s.add(new Product("mleko",2));
        s.add(new Product("maslanka",4));
        System.out.println(s);
        System.out.println(s.total());
        s.add(new Product("Kaktuz" , 1245));
        System.out.println(s);
        System.out.println(s.total());
    }
}
