public class Cosmetic {
    
    private String brand;
    private String name;
    private double price;
    private boolean organic;
    private int quantity;

    
    public Cosmetic(String brand, String name, double price, boolean organic, int quantity) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.organic = organic;
        this.quantity = quantity;
    }



	public String product_details(String brand){
		if(brand=="Signature"){
			System.out.println("Brand Name :"+brand);
		}else{
			System.out.println("No Brand Name");
		}
		return"Found";
	}
	public String product_details(String brand,int quantity){
		if(quantity<=20){
			System.out.println("Brand Name ::"+brand);
			System.out.println("Quantity is :"+quantity);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
	public String product_details(String brand,int quantity,double price){
		if(this.price>=50.0){
			System.out.println("Brand Name ::"+brand);
			System.out.println("Quantity is :"+quantity);
			System.out.println("Price is :"+this.price);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
	public String product_details(String brand,int quantity,double price,boolean organic){
		if(this.organic==true){
			System.out.println("Brand Name ::"+this.brand);
			System.out.println("Quantity is :"+quantity);
			System.out.println("Price is :"+this.price);
			System.out.println("Product is organic :"+this.organic);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
	public String product_details(String brand,int quantity,double price,boolean organic,String name){
		if(name!="Lemon"){
			System.out.println("Brand Name ::"+this.brand);
			System.out.println("Quantity is :"+quantity);
			System.out.println("Price is :"+this.price);
			System.out.println("Product is organic :"+this.organic);
			System.out.println("Product flavour :"+this.name);
		}else{
			System.out.println("Nothing found");
		}
		return"Found";
	}
}