public class Cloths{
	public static final double gst = 0.09;
public static void clothBrand(){
String clothBrand ="Zara";
System.out.println("CLOTH BRAND:"+clothBrand);
}
public static void clothColor(){
String clothColor ="BLACK";
System.out.println("CLOTH COLOUR :"+clothColor);
}
public static void clothPrice(){
int clothprice =7000;
System.out.println("CLOTH PRICE :"+clothprice);

}
public static void getGst(int price){
double getGst =price*Cloth.gst;
System.out.println("PLUS GST 9% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Cloth.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}