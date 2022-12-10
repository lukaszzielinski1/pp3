import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    private String a = "";

    public String getA() {
        return a;
    }
    public String getName() {
        return name;
    }
    Library(String name){
        this.name = name;
    }

    void addBook(Book book){
        books.add(book);
    }

    void booksToA(){
        for(Book b: books){
            this.a += b.toString();
            this.a += "\n";
            this.a += "            ";
        }  
        }

    @Override
    public String toString() {
        return "Library name: " + this.name + ", Number of books: " + books.size() + "\n" + "Books list: " + this.a + '\n';
    }

    public static void main(String[] args) {
        Library l = new Library("Biblioteka imienia Św. Gordona");
        l.addBook(new Book("Industrial revolution and its consequences", "Ted Kaczynski"));
        l.addBook(new Ebook("Industrial revolution and its consequences 2: the return of Industrial Revolution", "Ted Kaczynski", "IRAIS2.txt"));
        l.addBook(new Ebook("Dr Sysy vs OldMan 17: The rise of Grapcio","Gupta Skladowy","The rise of Grapcio.txt"));
        l.addBook(new Audiobook("Tiger Bonzo Autobiography", "Tiger Bonzo", 1240, 59));
        l.addBook(new Audiobook("Ksiazka","Tworca",4,20));
        l.booksToA();
        System.out.println(l);
    }
}
