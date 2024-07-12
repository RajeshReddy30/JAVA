public class TelegramRunner{
	public static void main(String args[]){
	Telegram.info();
	Telegram.users(500000L);
	Telegram.rating((byte)5,500);
	Telegram.grade_info((byte)5,500,'A');
	Telegram.properties((byte)5,500,true,'A');
	Telegram.data("Telegram",(byte)5,500,true,'A');




	
	
	}

}
