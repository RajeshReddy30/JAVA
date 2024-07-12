class EatSure {

    static String name = "EatSure";
    static int partners = 200;
    static boolean isCertified = true;

    public static void details(String type, boolean deliveryAvailable, String rating) {
        String cuisine = "Multi-Cuisine";
        String packaging = "Eco-Friendly";
        String storage = "Refrigerated";

        System.out.println("App name is: " + EatSure.name);
        System.out.println("Number of partners is: " + EatSure.partners);
        System.out.println("Is it certified: " + EatSure.isCertified);
        System.out.println("Service type is: " + type);
        System.out.println("Is delivery available: " + deliveryAvailable);
        System.out.println("Rating is: " + rating);
        System.out.println("Cuisine type is: " + cuisine);
        System.out.println("Packaging type is: " + packaging);
        System.out.println("Storage method is: " + storage);
    }

    public static void main(String[] args) {
        EatSure.details("Food Delivery", true,"4.8");
}
}