public class SuperCounter extends Counter{

    private int a;

    public int getA() {
        return a;
    }
    SuperCounter(int a){
        super(a);
    }

    void addN(int n){
        this.a += n;
    }
}
