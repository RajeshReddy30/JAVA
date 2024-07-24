public class CosmeticRunner{

public static void main(String args[]){


Cosmetic data = new Cosmetic("Mouthfresh", "Mint", 99.99, true, 30);

data.product_details("Fog");
data.product_details("Fog",20);
data.product_details("Fog",20,99.99);
data.product_details("Fog",20,99.99,true);
data.product_details("Fog",20,99.99,true,"Mint");
}
}