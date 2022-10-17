public class Time {
    public static void main(String[] args) {
        int hour = 22;
        int minute = 20;
        int second = 21;
        int seconds = hour*60*60+minute*60+second;
        System.out.println("Seconds sinc midnight: "+hour*60*60+minute*60+second);
        System.out.print("Seconds remaining in the day: ");
        System.out.println(86400-seconds);
        System.out.println("Percentage of the day: "+seconds*100/86400);
    }
}
