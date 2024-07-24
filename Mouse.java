public class Mouse{
    
    public String brand;
    public String mousetype;
    public double price;
    public String colour;
    public float distance;

    
    public Mouse(String brand, String  mousetype, double price, String colour, float distance) {
        this.brand = brand;
        this.mousetype = mousetype;
        this.price = price;
        this.colour = colour;
        this.distance = distance;
    }



	public String product_details(String brand){
		if(brand=="Zebronics"){
			System.out.println("Brand Name :"+brand);
		}else{
			System.out.println("No Brand Name");
		}
		return"Found";
	}
	public String product_details(String brand,float distance){
		if(distance<=20){
			System.out.println("Brand Name ::"+brand);
			System.out.println("Distance is :"+distance);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
	public String product_details(String brand,float distance,double price){
		if(this.price>=50.0){
			System.out.println("Brand Name ::"+brand);
			System.out.println("Distance is :"+distance);
			System.out.println("Price is :"+this.price);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
	public String product_details(String brand,float distance,double price,String colour){
			System.out.println("Brand Name ::"+this.brand);
			System.out.println("Distance is :"+this.distance);
			System.out.println("Price is :"+this.price);
			System.out.println("Mouse colour is :"+this.colour);
		
		return"Found";
	}
	public String product_details(String brand,String mousetype,double price,String colour,float distance){
		if(mousetype!="Dell"){
			System.out.println("Brand Name ::"+this.brand);
			System.out.println("Distance is :"+distance);
			System.out.println("Price is :"+this.price);
			System.out.println("Mousetype is:"+this.mousetype);
			System.out.println("Colour is :"+this.colour);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
}