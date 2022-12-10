public class Book {
    protected String title;
    protected String author;
    
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public String toString(){
        return "Author: " + this.author + ", Title: " + this.title;
    }
    
}
