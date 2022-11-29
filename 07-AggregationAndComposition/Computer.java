class Computer{
    private String system;
    private boolean isOn;
    private String caseColor;
    private Processor processor;

    public Computer(String system, boolean isOn, String caseColor, Processor processor){
        this.system = system;
        this.isOn = isOn;
        this.caseColor = caseColor;
        this.processor = new Processor("Intel", 30.1, 10);
    }
    
    public String getCaseColor() {
        return caseColor;
    }
    public String getSystem() {
        return system;
    }
    public boolean getIsOn(){
        return isOn;
    }
    public String getCPU() {
        return processor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public void setSystem(String system) {
        this.system = system;
    }
    public void setCPU(String cPU) {
        this.processor = processor;
    }

    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
    }
    public String toString(){
        return "System: " + this.system + " ON: " + this.isOn;
    }
    
}


class Main{
    public static void main(String[] args) {
        Computer c = new Computer("Windows", true, "Blue");
        Processor p = new Processor();

        }
    }
}