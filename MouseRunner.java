public class MouseRunner{

public static void main(String args[]){


Mouse data = new Mouse("Dell", "Wireless", 999.0, "Black", 12f);

data.product_details("Zebronics");
data.product_details("Zebronics",12f);
data.product_details("Zebronics",12f,999);
data.product_details("Zebronics",12f,999,"White");
data.product_details("Zebronics","Wireless",999,"White",12f);
}
}