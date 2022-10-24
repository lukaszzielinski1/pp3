public class Lamp{
    //Attributes
    
    boolean on;
    
    //Behaviors
    
    public void switchOn(){
        on = true;
    }
    
    public void switchOff(){
        on = false;
    }
    
    public void info(){
        if(on == true){
            System.out.println("The lamp is on.");
        } else {
            System.out.println("The lamp is off.");
        }
    }
}

