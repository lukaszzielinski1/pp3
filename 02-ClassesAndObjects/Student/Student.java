public class Student{
    
    //Atrybuty:
    
    String name;
    int age;
    String ID;
    boolean valid;
    int semester;
    double average;

    //Zachowania:
    
    public void sayHello(){
       System.out.println("Hello"); 
    }
    
    public void displayName(){
        System.out.println("My name " + name);
    }
    
    public void displayAge(){
        System.out.println("I'm " + age + " " + "years old");
    }
    public void showInfo(){
        System.out.println("Name: " + name + ", Semester number: " + semester + ", Average grade: " + average);
    }
    public void changeIDStatus(){
        valid = !valid;
    }
    public void display(){
        System.out.println("Name: " + name + ", ID number: " + ID + ", ID card valid: " + valid);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Marek";
        s1.age = 17;
        s1.ID = "14203";
        s1.valid = true;
        s1.semester = 3;
        s1.average = 3.7;
        s1.sayHello();
        s1.displayAge();
        s1.changeIDStatus();
        s1.display();
    }
}