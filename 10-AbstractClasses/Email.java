public class Email extends Message {
private String email;
private String subject;

public String getSubject() {
    return subject;
}

public String getEmail() {
    return email;
}

Email(String text, String email, String subject){
    super(text);
    this.email = email;
    this.subject = subject;
}
    
@Override
void send() {
    System.out.println("Email address: " + this.email);
    System.out.println("Subject: " + this.subject);
    System.out.println("Message: " + this.getText());
}
}
