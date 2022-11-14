public class DrivingLicense{
    
    private String name;
    private String surname;
    private String address;
    private String postal;
    private String city;
    private String number;
    private int year;
    private String category;
    
    String getName(){
        return name;
    }
    
    String getSurname(){
        return surname;
    }
    
    String getAddress(){
        return address;
    }
    
    String getPostal(){
        return postal;
    }
    
    String getCity(){
        return city;
    }
    
    String getNumber(){
        return number;
    }
    
    int getYear(){
        return year;
    }
    
    String getCategory(){
        return category;
    }
    
    //setters
    
    void setName (String n){
        n = n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase();
        this.name = n;
    }
    
    void setSurname(String s){
        this.surname = s;
    }
    
    void setAddress(String a){
        this.address = a;
    }
    
    void setPostal(String p){
        this.postal = p;
    }
    
    void setCity(String c){
        this.city = c;
    }
    
    void setNumber(String no){
        this.number = no;
    }
    
    void setYear(int y){
        if(y >= 1980 && y<=2022){
            this.year = y;
        }
    }
    
    void setCategory(String ca){
        this.category = ca;
    }
    
    public String toString(){
        return(getName() + " " + getSurname()+ "\n" + getAddress()+" "+ getCity() + " " + getPostal());
    }
    
    public static void main(String[] args){
        DrivingLicense d1 = new DrivingLicense();
        d1.setName("ziUteK");
        d1.setSurname("Ronaldo");
        d1.setAddress("Wododzialowa");
        d1.setCity("Pelplin");
        d1.setPostal("16-290");
        System.out.println(d1);
    }
}
