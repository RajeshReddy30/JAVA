public class MovieTickets{
public static final int seat = 100;
public static void movieName(){
	String movieName ="Sapthasagara ache ello";
System.out.println("MOVIE NAME :"+movieName);
}
public static void totalSeat(){
	int totalSeat = MovieTickets.seat;
	System.out.println("TOTAL SEAT IN TEATER :"+totalSeat);
}
public static void seatBooked(){
	int seatBooked = 57;
	System.out.println("TOTAL SEAT BOOKED :"+seatBooked);
}
public static void remainingSeat(int seatBooked){
	int remainingSeat = MovieTickets.seat-seatBooked;
	System.out.println("REMAINING SEAT LEFT :"+remainingSeat);
}
public static void ticketPrice(){
	int price = 270;
	System.out.println("1 TICKET :"+price);
}

}