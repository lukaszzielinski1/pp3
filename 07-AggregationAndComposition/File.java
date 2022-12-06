public class File {
    private String name;
    private int fileSize;

    File(String name, int fileSize){
        this.name = name;
        this.fileSize = fileSize;
    }
    
    
    public String getName() {
        return name;
    }
    public int getSize() {
        return fileSize;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.fileSize = size;
    }
    
    @Override
    public String toString() {
        return "File name: " + this.name + ", File size: " + this.fileSize;
    }

}
