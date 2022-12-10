public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    Audiobook(String author, String title, int minutes, int seconds){
        super(author, title);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString(){
        return("Author: " + this.author + ", Title: " + this.title + ", Time: " + minutes + ":" + seconds);
    }

}
