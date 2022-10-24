public class Book{
    
    //Attributes
    
    String name;
    String author;
    int pages;
    double rating;
    
    //Behaviors
    
    public void showInfo(){
        System.out.println("Book name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + pages);
        System.out.println("Rating: " + rating);
    }
    
    public static void main(String[] args){
        Book b1 = new Book();
        b1.name = "The Autobiography of Gucci Mane";
        b1.author = "Gucci Mane";
        b1.pages = 304;
        b1.rating = 4.8;
        b1.showInfo();
    }
}