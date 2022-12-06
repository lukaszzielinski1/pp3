public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();

    public String getName() {
        return name;
    }
    Library(String name){
        this.name = name;
    }
}
