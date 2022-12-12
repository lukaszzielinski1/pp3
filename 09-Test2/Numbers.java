public class Numbers{
    int a;
    int b;
    int c;
    int d;
    int e;

    public Numbers(int a, int b, int c, int d, int e){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public boolean different(){
        int[] numbers = new int[]{a,b,c,d,e};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j <numbers.length; j++){
                if(numbers[i] == numbers[j] && i!=j){
                    return false;
                }
            }
    }
    return true;
}

    public static void main(String[] args) {
        Numbers n = new Numbers(3,4,2,1,6);
        System.out.println(n.different());
        Numbers n2 = new Numbers(9,7,4,3,7);
        System.out.println(n2.different());
    }
}
