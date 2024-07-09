public class FoodItemsRunner {
    public static void main(String[] args) { 
        FoodItems.display();
        FoodItems.display("dosa");
        FoodItems.display("Apple", 1.50);
        FoodItems.display("Apple", 1.50, 10);
        FoodItems.display("Apple", 1.50, 10, "Fruit");
        FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01");
        FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01", true);
        FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01", true, false);
        FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01", true, false, "Organic");
        FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01", true, false, "Organic", "USA");
        FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01", true, false, "Organic", "USA", "None");
        //FoodItems.display("Apple", 1.50, 10, "Fruit", "2024-08-01", true, false, "Organic", "USA", "None", 52);
}}