public class Laptop{

public String name;
public String brand;
public int price;
public String colour;
public int storage;
public float weight;
public short ram;
public byte no_of_apps;
public String version;
public short battCapacity;

public Laptop(){
System.out.println("Default Argument constructr");
}
public Laptop(String name){
	this(65000,"Apple","Dell");
this.name = name;
System.out.println("Laptop name is :"+name);
System.out.println("1st Constructor");
}
public Laptop(String brand,String name){
	this("Dell");
this.brand = brand;
this.name = name;
System.out.println("Laptop brand is :"+brand);
System.out.println("Laptop name is :"+name);
System.out.println("2nd Constructor");
}

public Laptop(int price,String name,String brand){
this.price = price;
this.brand = brand;
this.name = name;
System.out.println("Price of the Laptop is:"+price);
System.out.println("Laptop brand is :"+brand);
System.out.println("Laptop name is :"+name);

}
public Laptop(String name,String brand,int price,String colour,int storage,float weight,short ram,byte no_of_apps,String version,short battCapacity){
this.name = name;
this.price = price;
this.brand = brand;
this.colour = colour;
this.storage = storage;
this.weight = weight;
this.ram = ram;
this.no_of_apps = no_of_apps;
this.version = version;
this.battCapacity = battCapacity;
System.out.println("Below Shows all details of Laptop");
System.out.println("Price of the Laptop is:"+price);
System.out.println("Laptop brand is :"+brand);
System.out.println("Laptop name is :"+name);
System.out.println("Laptop Colour is:"+colour);
System.out.println("Laptop Storage is :"+storage);
System.out.println("Weight of the Laptop is :"+weight);
System.out.println("Laptop RAM is :"+ram);
System.out.println("No_of_apps in Laptop is:"+no_of_apps);
System.out.println("Laptop Version is :"+version);
System.out.println("Battery Capacity of the Laptop is :"+battCapacity);
System.out.println("------------------Constructor Ended-----------------");
}
public String getlaptopdetails(String name){

if(this.name==name){
	System.out.println("Name of the Laptop is:"+name);
 return "Laptop details are";
 //System.out.println("Name of the Laptop is:"+name);
}else{
 return "No Laptop";
}
//return name;
}
public String getlaptopdetails(int price,String name){

if(this.price<=price){
	System.out.println("Name of the Laptop is:"+name+"::"+"Price:"+price);
 return "Laptop details are";
}else{
 return "No Laptop";
}

}
public String getlaptopdetails( String brand,int price,String name){

if(this.brand==brand){
	System.out.println("Name of the Laptop is:"+name+"::"+"Price:"+price+"::"+"Brand is:"+brand);
 return "Laptop details are";
}else{
 return "No Laptop";
}

}
public String getlaptopdetails(short ram,String brand,int price,String name){

if(this.ram<=ram){
	System.out.println("Name of the Laptop is:"+name+"::"+"Price:"+price+"::"+"Brand is:"+brand+"::"+"RAM is:"+ram);
 return "Laptop details are";
}
else{
 return "No Laptop";
}

}
}