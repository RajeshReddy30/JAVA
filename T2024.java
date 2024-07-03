class T2024 {
    public static void score() {
        int score = 180;

        if (score > 200) {
            System.out.println("High score: " + score);
        } else if (score < 100) {
            System.out.println("Low score: " + score);
        } else {
            System.out.println("Average score");
        }
    }

    public static void wickets() {
        int wickets = 8;

        if (wickets >= 8) {
            System.out.println("Bowling performance is excellent");
        } else if (wickets >= 5 && wickets < 8) {
            System.out.println("Bowling performance is average");
        } else {
            System.out.println("Bowling performance is poor");
        }
    }

    public static void matchRating() {
        int rating = 4;

        if (rating >= 4) {
            System.out.println("Match rating is good");
        } else if (rating >= 2 && rating < 4) {
            System.out.println("Match rating is average");
        } else {
            System.out.println("Match rating is bad");
        }
    }
}
