public class CinemaTicket{
    
    static String cinemaName = "Cinema City";
    String film;
    int row;
    int seat;
    double price;
    
    public void showInfo(){
        System.out.println("Cinema: " + cinemaName);
        System.out.println("Film: " + film);
        System.out.println("Row and seat: " + row + ", " + seat);
        System.out.println("Price: " + createTicket());
    }
    
    public double createTicket(){
        if(row<=2){
            return 10;
        } else {
            return 25;
        }
    }
    
    public CinemaTicket(String f, int r, int s){
        film = f;
        row = r;
        seat = s;
    }
    
    public static void main(String[] args){
        CinemaTicket c1 = new CinemaTicket("Gladiator",2,5);
        CinemaTicket c2 = new CinemaTicket("Gladiator",7,5);
        c1.createTicket();
        c2.createTicket();
        c1.showInfo();
        c2.showInfo();
    }
}