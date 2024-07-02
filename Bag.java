public class Bag{
	public static final double gst = 0.07;
public static void bagName(){
String bagName ="WILD CRAFT";
System.out.println("BAG NAME:"+bagName);
}
public static void bagColor(){
String bagColor ="BLACK";
System.out.println("BAG COLOUR :"+bagColor);
}
public static void bagPrice(){
int bagprice =1100;
System.out.println("BAG PRICE :"+bagprice);

}
public static void getGst(int price){
double getGst =price*Bag.gst;
System.out.println("PLUS GST 5% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Bag.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}