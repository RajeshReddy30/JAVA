public class Gold{
	public static final double gst = 0.10;
public static void goldRate(){
int goldRate =7000;
System.out.println("GOLD RATE PER GRAM :"+goldRate);
}
public static void carate(){
String carate ="24 CARATE";
System.out.println("GOLD CARATE :"+carate);
}
public static void Price(){
int Price =56000;
System.out.println("PRICE FOR 8 GRAMS :"+Price);

}
public static void getGst(int price){
double getGst =price*Cloth.gst;
System.out.println("PLUS GST 10% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Gold.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}