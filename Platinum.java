public class Platinum{
	public static final double gst = 0.10;
public static void platinumRate(){
int platinumRate =3636;
System.out.println("PLATINUM RATE PER GRAM :"+platinumRate);
}
public static void type(){
String type ="RING";
System.out.println("TYPE :"+type);
}
public static void Price(){
int Price =7272;
System.out.println("PRICE FOR 2 GRAMS :"+Price);

}
public static void getGst(int price){
double getGst =price*Cloth.gst;
System.out.println("PLUS GST 10% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Platinum.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}