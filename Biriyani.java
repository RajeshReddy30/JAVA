public class Biriyani {

    public static void displayIngredients() {
		String ingredients[]={" ","Rice","vegetables-Carrot,Potato,Tomatos,Ginger,Beans","Spices-Coriender powder,Turmeric,Salt,Red chilli powder","other-Oil,Lemon juice,Water","Optional-Paneer,Cashews,Fresh mint leave"};
        for(int i=1;i<ingredients.length;i++) 
		System.out.println("Ingredients are : "+ingredients[i]);

        }
    }
	  public static void displayReview(int rating) {
        if (rating == 10) {
            System.out.println("Nice");
        } else if (rating > 5 && rating < 10) {
            System.out.println("Good ");
        } else if (rating < 5 && rating>=1) {
            System.out.println("worst");
        } else {
            System.out.println(" rating range is 1-10 ");
        }
    }
public static void calculateTotalPrice(String quality, float price) {
        float totalPrice = 0;
        if (quality == "Premium") {
            totalPrice = price + (price * 0.5);
			System.out.println("Total bill: "+totalPrice);
        } else if (quality == "Standard") {
            totalPrice = price;
			System.out.println("Total bill"+totalPrice);
        } else if (quality == "Economic") {
            totalPrice = price - (price * 0.3); 
			System.out.println("Total bill"+totalPrice);
        } else {
            System.out.println("Invalid Quality");
        }

    }

}