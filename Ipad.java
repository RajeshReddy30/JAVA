public class Ipad{
	public static final double gst = 0.10;
public static void brand(){
String brand ="APPLE";
System.out.println("BRAND :"+brand);
}
public static void model(){
String model ="11th Generation";
System.out.println("MODEL :"+model);
}
public static void Price(){
int Price =91000;
System.out.println("PRICE :"+Price);

}
public static void getGst(int price){
double getGst =price*Cloth.gst;
System.out.println("PLUS GST 10% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*Ipad.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}