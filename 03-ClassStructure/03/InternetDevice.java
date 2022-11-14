
public class InternetDevice{
    String name;
    boolean connected;
    static int connectedDevices = 0;
    
    public InternetDevice(String name){
        this.name = name;
    }
    
    public void connect(){
        if(connected==false){
            connected=true;
            connectedDevices++;
        }
    }
    
    public void disconnect(){
        if(connected==true){
            connected = false;
            connectedDevices--;
        }
    }
    
    public void isConnected(){
        if(connected==true){
            System.out.println("The device is connected.");
        }else{
            System.out.println("The device is disconnected.");
        }
    }
    
    public void displayStatus(){
        System.out.println("Device name: " + name);
        if(connected==true){
            System.out.println("The device is connected.");
        }else{
            System.out.println("The device is disconnected.");
        }
    }
    
    public static void displayConnections(){
        System.out.println("Number of connected devices: " + connectedDevices);
    }
    
    public static void main(String[] args){
        InternetDevice i = new InternetDevice("Laptop");
        i.connect();
        i.displayStatus();
        InternetDevice i2 = new InternetDevice("Telefon");
        i2.connect();
        i2.displayStatus();
        InternetDevice i3 = new InternetDevice("Roomba");
        i3.disconnect();
        i3.displayStatus();
        displayConnections();
    }
}
