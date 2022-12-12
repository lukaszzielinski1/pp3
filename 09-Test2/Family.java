import java.util.ArrayList;

public class Family {
    private ArrayList<Person> people = new ArrayList<Person>();

    public Family(Person...person){
        for(Person p: person){
            people.add(p);
        }
    }

    public int adults(){
        int counter = 0;
        for(int i=0; i<people.size();i++){
            if(people.get(i).getAge()>=18){
                counter+=1;
            }
        }
    return counter;
    }

    public static void main(String[] args) {
        Family f = new Family(new Person("Tomcio",19), new Person("Grapcioslaw",10),new Person("CHief Keef", 300));
        System.out.println(f.adults());
    }
}

