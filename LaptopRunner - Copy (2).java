public class LaptopRunner{
	public static void main(String args[]){
		Laptop laptopDetails =new Laptop();
		System.out.println("Array length is:......");
		System.out.println(laptopDetails.laptopNamesLength());
		System.out.println(".......laptop brands are:......");
		laptopDetails.setbyBrands("lenovo");
		laptopDetails.setbyBrands("hp");
		laptopDetails.setbyBrands("asus");
		laptopDetails.setbyBrands("msi");
		laptopDetails.readbybrands();
		System.out.println(".......updated laptop brands are:......");
		laptopDetails.updatebyBrands("asus","dell");
		System.out.println(".......delete laptop brands are:......");
		laptopDetails.deletelaptopNames("msi");
		
	}
}