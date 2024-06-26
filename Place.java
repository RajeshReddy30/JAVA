class Place {

    static String places[] = { "Hyderabad", "Tirupati","Bengaluru"};

    public static void main(String args[]) {

        String i = "Bengaluru";

        boolean matchFound = false;
        for (int index = 0; index < places.length; index++) {
            if (i==(places[index])) {
                matchFound = true;
               
            }
        }

        if (matchFound) {
            System.out.println("Matched element is: " + i);
        } else {
            System.out.println("No matched elements");
}
}
}