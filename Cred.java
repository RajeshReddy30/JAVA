class Cred {

    static String name = "Cred";
    static int users = 1000000;
    static boolean isRewarding = true;

    public static void details(String type, boolean secure, String cashback) {
        String platform = "Credit Card Payment";
        String security = "High";
        String storage = "Encrypted";

        System.out.println("App name is: " + Cred.name);
        System.out.println("Number of users is: " + Cred.users);
        System.out.println("Is it rewarding: " + Cred.isRewarding);
        System.out.println("Service type is: " + type);
        System.out.println("Is it secure: " + secure);
        System.out.println("Cashback type is: " + cashback);
        System.out.println("Platform type is: " + platform);
        System.out.println("Security level is: " + security);
        System.out.println("Storage method is: " + storage);
    }

    public static void main(String[] args) {
        Cred.details("Finance", true,"5%");
}
}