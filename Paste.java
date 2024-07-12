class Paste {

    static String name = "close up";
    static int num = 20;
    static boolean quality = true; 
	public static void main(String args[]) {
        Paste.maxfresh("dental", true,"349");
}

    public static void maxfresh(String type, boolean gemsfree, String quantity) {
        String chemical = "NPK";
        String composition = "complex";
        String stored = "container"; 

        System.out.println("paste name is: " + Paste.name);
        System.out.println("NO of pastes is: " + Paste.num);
        System.out.println("paste quality is: " + Paste.quality);
        System.out.println("paste type is: " + type);
        System.out.println("is it gems free: " + gemsfree);
        System.out.println("paste quantity is: " + quantity);
        System.out.println("paste chemical is: " + chemical);
        System.out.println("paste composition is: " + composition);
        System.out.println("paste stored in is: " + stored);
    }

   
}