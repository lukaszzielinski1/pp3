class Processor{
    private String name;
    private double timing;
    private int coreNumber;

    
    public Processor(String name, double timing, int coreNumber) {
        this.name = name;
        this.timing = timing;
        this.coreNumber = coreNumber;
    }

    public int getCoreNumber() {
        return coreNumber;
    }
    public String getName() {
        return name;
    }
    public double getTiming() {
        return timing;
    }
    public void setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTiming(double timing) {
        this.timing = timing;
    }

    public int sum(int a, int b){
        return a + b;
    }

}