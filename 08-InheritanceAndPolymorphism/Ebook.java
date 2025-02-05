public class Ebook extends Book {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    Ebook(String author, String title,String fileName){
        super(author,title);
        this.fileName = fileName;
    }

    public String toString(){
        return "Author: " + this.author + ", Title: " + this.title + ", File name: " + this.fileName;
    }
}
