class Banks{
    public static void interestRate() {
        double rate = 3.5;

        if (rate < 4) {
            System.out.println("Interest rate is low: " + rate);
        } else if (rate > 6) {
            System.out.println("Interest rate is high: " + rate);
        } else {
            System.out.println("Interest rate is average");
        }
    }

    public static void services() {
        int quality = 7;

        if (quality >= 8) {
            System.out.println("Bank services are excellent");
        } else if (quality >= 5 && quality < 8) {
            System.out.println("Bank services are average");
        } else {
            System.out.println("Bank services are poor");
        }
    }

    public static void rating() {
        int rating = 5;

        if (rating >= 4) {
            System.out.println("Bank rating is good");
        } else if (rating >= 2 && rating < 4) {
            System.out.println("Bank rating is average");
        } else {
            System.out.println("Bank rating is bad");
        }
    }
}

