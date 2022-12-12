public class Arrays{
    static int counter1;
    static int counter2;
    static int[] arr1;
    static int[] arr2;
    public static boolean arr(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>9 && arr1[i] <100){
                counter1++;
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>9 && arr2[i] <100){
                counter2++;
            }
        }
        return counter1==counter2;
    }

    public static void main(String[] args) {
        System.out.println(arr(new int[]{15,8,2,37,49,117},new int[]{9,6,7,12,58,4,6,12,6}));
    }
}