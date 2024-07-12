class Zomato {

    static String name = "Zomato";
    static int restaurants = 10000;
    static boolean isGlobal = true;

    public static void details(String type, boolean contactlessDelivery, String membership) {
        String cuisine = "Global Cuisine";
        String service = "Fast Delivery";
        String storage = "Real-time Data";

        System.out.println("App name is: " + Zomato.name);
        System.out.println("Number of restaurants is: " + Zomato.restaurants);
        System.out.println("Is it global: " + Zomato.isGlobal);
        System.out.println("Service type is: " + type);
        System.out.println("Is contactless delivery available: " + contactlessDelivery);
        System.out.println("Membership type is: " + membership);
        System.out.println("Cuisine type is: " + cuisine);
        System.out.println("Service type is: " + service);
        System.out.println("Storage method is: " + storage);
    }

    public static void main(String[] args) {
        Zomato.details("Food Delivery", true, "Gold");
}
}