public class StadiumTickets{
public static final int seat = 100000;
public static void StadiumName(){
	String StadiumName ="KANTERAVA";
System.out.println("STADIUM NAME :"+StadiumName);
}
public static void totalSeat(){
	int totalSeat = StadiumTickets.seat;
	System.out.println("TOTAL SEAT IN STADIUM :"+totalSeat);
}
public static void seatBooked(){
	int seatBooked = 57000;
	System.out.println("TOTAL SEAT BOOKED :"+seatBooked);
}
public static void remainingSeat(int seatBooked){
	int remainingSeat = StadiumTickets.seat-seatBooked;
	System.out.println("REMAINING SEAT LEFT :"+remainingSeat);
}
public static void ticketPrice(){
	int price = 4500;
	System.out.println("1 TICKET :"+price);
}

}