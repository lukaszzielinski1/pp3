public class Car extends Vehicle{

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    
    Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    int[] spec(){
        return new int[]{super.getSeats(), this.maxSpeed};
    }

}
