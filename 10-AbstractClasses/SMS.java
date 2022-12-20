public class SMS extends Message{
    private String number;

    public String getNumber() {
        return number;
    }

    SMS(String text, String number){
        super(text);
        this.number = number;
    }

    void send(){
        System.out.println("Number: " + this.number);
        System.out.println("Message: " + this.getText());
    }
}
