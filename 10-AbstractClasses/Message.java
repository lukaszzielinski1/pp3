public abstract class Message {
    private String text;


    public String getText() {
        return text;
    }

    Message(){
        this.text = "";
    }

    Message(String text){
        this.text = text;
    }

    int charNumber(){
        return this.text.length();
    }

    abstract void send();   

    public static void main(String[] args) {
        Message sms = new SMS("Im like hey whats up hello?","1738");
        sms.send();
        Message email = new Email("Dima maghreb","mohamudsharmarke@o2.pl","Alhamdulilah");
        email.send();
    }
}
