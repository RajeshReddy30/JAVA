class JioSaavn {

    static String name = "JioSaavn";
    static int subscribers = 5000000;
    static boolean isPremium = false;

    public static void details(String type, boolean adFree, String subscription) {
        String platform = "Music Streaming";
        String quality = "High Definition";
        String storage = "Cloud";

        System.out.println("App name is: " + JioSaavn.name);
        System.out.println("Number of subscribers is: " + JioSaavn.subscribers);
        System.out.println("Is premium available: " + JioSaavn.isPremium);
        System.out.println("Service type is: " + type);
        System.out.println("Is it ad-free: " + adFree);
        System.out.println("Subscription type is: " + subscription);
        System.out.println("Platform type is: " + platform);
        System.out.println("Content quality is: " + quality);
        System.out.println("Storage method is: " + storage);
    }

    public static void main(String[] args) {
        JioSaavn.details("Music", true, "Monthly");
}
}