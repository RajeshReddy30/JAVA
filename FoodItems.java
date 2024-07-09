class FoodItems {
    public static void display() {
        System.out.println("Displaying food items");
    }

    public static void display(String name) {
        System.out.println("Displaying food item: " + name);
    }

    public static void display(String name, double price) {
        System.out.println("Displaying food item: " + name + ", Price: " + price);
    }

    public static void display(String name, double price, int quantity) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void display(String name, double price, int quantity, String category) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category);
    }

    public static void display(String name, double price, int quantity, String category, String expiryDate) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category + ", Expiry Date: " + expiryDate);
    }

    public static void display(String name, double price, int quantity, String category, String expiryDate, boolean isVegetarian) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category + ", Expiry Date: " + expiryDate + ", Vegetarian: " + isVegetarian);
    }

    public static void display(String name, double price, int quantity, String category, String expiryDate, boolean isVegetarian, boolean isGlutenFree) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category + ", Expiry Date: " + expiryDate + ", Vegetarian: " + isVegetarian + ", Gluten Free: " + isGlutenFree);
    }

    public static void display(String name, double price, int quantity, String category, String expiryDate, boolean isVegetarian, boolean isGlutenFree, String brand) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category + ", Expiry Date: " + expiryDate + ", Vegetarian: " + isVegetarian + ", Gluten Free: " + isGlutenFree + ", Brand: " + brand);
    }

    public static void display(String name, double price, int quantity, String category, String expiryDate, boolean isVegetarian, boolean isGlutenFree, String brand, String origin) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category + ", Expiry Date: " + expiryDate + ", Vegetarian: " + isVegetarian + ", Gluten Free: " + isGlutenFree + ", Brand: " + brand + ", Origin: " + origin);
    }

    public static void display(String name, double price, int quantity, String category, String expiryDate, boolean isVegetarian, boolean isGlutenFree, String brand, String origin, String allergens) {
        System.out.println("Displaying food item: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category + ", Expiry Date: " + expiryDate + ", Vegetarian: " + isVegetarian + ", Gluten Free: " + isGlutenFree + ", Brand: " + brand + ", Origin: " + origin + ", Allergens: " + allergens);
    }
}
