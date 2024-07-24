public class Phone{

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

public Phone(){
System.out.println("Default Argument constructr");
}
public Phone(String name){
	this(65000,"Apple","IPhone");
this.name = name;
System.out.println("Mobile name is :"+name);
System.out.println("1st Constructor");
}
public Phone(String brand,String name){
	this("IPhone");
this.brand = brand;
this.name = name;
System.out.println("Mobile brand is :"+brand);
System.out.println("Mobile name is :"+name);
System.out.println("2nd Constructor");
}

public Phone(int price,String name,String brand){
this.price = price;
this.brand = brand;
this.name = name;
System.out.println("Price of the Mobile is:"+price);
System.out.println("Mobile brand is :"+brand);
System.out.println("Mobile name is :"+name);

}
public Phone(String name,String brand,int price,String colour,int storage,float weight,short ram,byte no_of_apps,String version,short battCapacity){
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
System.out.println("Below Shows all details of Mobile");
System.out.println("Price of the Mobile is:"+price);
System.out.println("Mobile brand is :"+brand);
System.out.println("Mobile name is :"+name);
System.out.println("Mobile Colour is:"+colour);
System.out.println("Mobile Storage is :"+storage);
System.out.println("Weight of the Mobile is :"+weight);
System.out.println("Mobile RAM is :"+ram);
System.out.println("No_of_apps in Mobile is:"+no_of_apps);
System.out.println("Mobile Version is :"+version);
System.out.println("Battery Capacity of the Mobile is :"+battCapacity);
System.out.println("------------------Constructor Ended-----------------");
}
public String getmobiledetails(String name){

if(this.name==name){
	System.out.println("Name of the Mobile is:"+name);
 return "Mobile details are";
 //System.out.println("Name of the Mobile is:"+name);
}else{
 return "No mobiles";
}
//return name;
}
public String getmobiledetails(int price,String name){

if(this.price<=price){
	System.out.println("Name of the Mobile is:"+name+"::"+"Price:"+price);
 return "Mobile details are";
}else{
 return "No mobiles";
}

}
public String getmobiledetails( String brand,int price,String name){

if(this.brand==brand){
	System.out.println("Name of the Mobile is:"+name+"::"+"Price:"+price+"::"+"Brand is:"+brand);
 return "Mobile details are";
}else{
 return "No mobiles";
}

}
public String getmobiledetails(short ram,String brand,int price,String name){

if(this.ram<=ram){
	System.out.println("Name of the Mobile is:"+name+"::"+"Price:"+price+"::"+"Brand is:"+brand+"::"+"RAM is:"+ram);
 return "Mobile details are";
}
else{
 return "No mobiles";
}

}
}