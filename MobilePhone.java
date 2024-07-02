public class MobilePhone{
	public static final double gst = 0.10;
public static void brand(){
String brand ="SAMSUNG";
System.out.println("BRAND :"+brand);
}
public static void model(){
String model ="SAMSUNG GALAXY A51";
System.out.println("MODEL :"+model);
}
public static void Price(){
int Price =26000;
System.out.println("PRICE :"+Price);

}
public static void getGst(int price){
double getGst =price*Cloth.gst;
System.out.println("PLUS GST 10% :"+getGst);

}
public static void totalPrice(int price){
double totalPrice =price+(price*MobilePhone.gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
}