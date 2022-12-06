import java.util.ArrayList;

public class Folder {
    private String name;
    private int size = 0;
    private ArrayList<File> files = new ArrayList<File>();
    
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    Folder(String name){
        this.name = name;
    }

    void addFile(File file){
        files.add(file);
    }
    
    void removeFile(int index){
        files.remove(index);
    }

    public String toString() {
        return "Folder name: " + this.name + "\n" + "Number of files: " + files.size() + "\n" + "Files: " + files.toString() + "\n";
    }

    public static void main(String[] args) {
        Folder f = new Folder("Industrial revolution and its consequences");
        f.addFile(new File("Manifesto.txt",400));
        f.addFile(new File("Fortnite.exe", 1000));
        System.out.println(f);
        f.addFile(new File("Sysy vs Oldman 2: powrót Czumpiego.mp4", 12450));
        System.out.println(f);
        f.removeFile(1);
        System.out.println(f);
    }
}

