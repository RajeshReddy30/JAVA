public class PhoneRunner{

public static void main(String args[]){

Phone phone = new Phone();
Phone phone1 = new Phone("IPhone");
Phone phone2 = new Phone("Apple","IPhone");
Phone cell = new Phone(65000,"IPhone","Apple");
Phone cell1 = new Phone("IPhone","Apple",65000,"White",128,30f,(short)64,(byte)29,"Iphone14Pro",(short)5000);

cell.getmobiledetails("IPhone");
cell.getmobiledetails(65000,"IPhone");
cell.getmobiledetails("IPhone",65000,"IPhone");
cell.getmobiledetails((short)64,"Grapes",65000,"IPhone");
}
}