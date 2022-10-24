public class Counter {
    int count = 0;
    
    public void addOne(){
        count += 1;
    }
    
    public void subtractOne(){
        count -= 1;
    }
    
    public void addTen(){
        count += 10;
    }
    
    public void subtractTen(){
        count -= 10;
    }
    
    public void showCount(){
        System.out.println("Count: " + count);
    }
}