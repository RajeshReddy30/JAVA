public class Metro{
    public static void displayTicketPrice(String from, String to) {
        if (from == "Bhanashankari" && to == "Majestic") {
            System.out.println("Ticket Price: Rs. 25");
        } else {
            System.out.println("Ticket Price: Rs. 50");
        }
    }
	    public static void checkCardBalance(int cardBalance, int ticketPrice) {
			if (cardBalance >= ticketPrice){
			System.out.println("Card Balecce is: "+cardBalance+" do transactions");
			int Balance = cardBalance - ticketPrice;
            System.out.println("Transaction successful"+"\n Your Card Balance is: Rs. " +Balance);
			}

    }
}