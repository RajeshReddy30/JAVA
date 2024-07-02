public class Weekend{
public static final double getgst = 0.18;
public static void sleeping(){
System.out.println("GOOD SLEEPING FOR 12 HRS")	;
}
public static void shopping(){
	int price = 10000;
	float totalPrice = price + (price*0.18f);
	System.out.println("TOTAL PRICE ="+totalPrice);
	
}
public static void gst(int price){
	double totalPrice=(Weekend.getgst*price)+price;
	System.out.println("TOTAL PRICE IS ="+totalPrice);
}
}
