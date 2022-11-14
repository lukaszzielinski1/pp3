public class Person{
    String name;
    double weight;
    double height;
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    public double calculateBMI(){
        return weight/Math.pow(height/100,2);
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + ", Height: " + height);
        System.out.println("BMI: " + calculateBMI());
        if(calculateBMI() < 18.5){
            System.out.println("BMI too low");
        }else if(calculateBMI() > 24.9){
            System.out.println("BMI too high");
        }else{
            System.out.println("BMI good");
        }
    }
    
    public static void main(String[] args){
        Person p = new Person("Zenek",71.4,179);
        Person p2 = new Person("Krzeslaw",56.7,160);
        Person p3 = new Person("Radzimil",74.5,202);
        p.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }
}
