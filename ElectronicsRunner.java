public class ElectronicsRunner{
public static void main(String[] args){
Electronics electronics = new Electronics();
System.out.println("Array Size"+electronics.arrLength());
electronics.creatByElectronicsNames("Monitor");
electronics.creatByElectronicsNames("Mouse");
electronics.creatByElectronicsNames("Cpu");
electronics.creatByElectronicsNames("Battery");
electronics.creatByElectronicsNames("Apple");
electronics.readByElectronicsNames();
System.out.println("--------Update--------");
String update = electronics.updatedByElectronicsNames("Apple", "Key Board");
System.out.println(update);
System.out.println("--------Delete--------");
String deleat =electronics.deleatByElectronicsNames ("Monitor");
System.out.println(deleat);
System.out.println("--------Search--------");
String search =electronics.SearchByElectronicsNames ("Battery");
System.out.println(search);
}
}
