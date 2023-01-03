class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    private String brand;
    private String model;
    private boolean status;
    private int channelNo = 1;
    private int volumeLevel = 1;

    public String getBrand() {
        return brand;
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
    public String getModel() {
        return model;
    }
    public int getChannelNo() {
        return channelNo;
    }
    TV(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void on(){
        this.status = true;
        this.volumeLevel = 1;
        this.channelNo = 1 ;
    }
    public void off(){
        this.status = false;
    }

    String showInfo(){
        String st = "";
        if(this.status == true){
            st = "On";
            return "Brand: " + this.brand + ", Model: " + this.model + ", Status: " + st + ", Channel number: " + this.channelNo + ", Volume level: " + this.volumeLevel;
        }else{
            st = "Off";
            return "Brand: " + this.brand + ", Model: " + this.model + ", Status: " + st;
        }
        
    }

    public void channelUp(){
        if(this.status == true){
            if(this.channelNo<99){
                channelNo++;
            }else{
                System.out.println("This is the last channel.");
            }
        }else{
            System.out.println("The TV is off.");
        }
    }

    public void channelDown(){
        if(this.status == true){
            if(this.channelNo>1){
                channelNo--;
            }else{
                System.out.println("This is the first channel.");
            }
        }else{
            System.out.println("The TV is off.");
        }
    }
    public void setChannel(int channelNo){
        if(this.status == true){
            if(channelNo > 0 && channelNo <100){
                this.channelNo = channelNo;
            }else{
                System.out.println("Selected channel doesn't exist.");
            }
        }else{
            System.out.println("The TV is off.");
        }
    }

    public void volumeUp(){
        if(this.status == true){
            if(volumeLevel <10){
                volumeLevel++;
            }else{
                System.out.println("Max volume reached.");
            }
        }else{
            System.out.println("The TV is off.");
        }
    }
    public void volumeDown(){
        if(this.status == true){
            if(volumeLevel > 1){
                volumeLevel--;
            }else{
                System.out.println("Min volume reached.");
            }
        }else{
            System.out.println("The TV is off.");
        }
    }
    
}
