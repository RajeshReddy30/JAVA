class Pets {

    public static void main(String[] args) {
    int[] petnums = {1, 2, 3};
	String[] pets = {"dog", "cat", "Parrots"};
    short[] lifeSpan  = {25, 20, 65};
    String[] name = {"Maxy", "Jimmy", "Twitter"};
        for (int ele=0; ele<petnums.length; ele++) {
            System.out.println(" Pet No.: "+petnums[ele]);
			System.out.println(" Pet: "+pets[ele]);
			System.out.println(" Approximate Life Span is: "+lifeSpan[ele]);
			System.out.println(" Name: "+name[ele]);
			System.out.println("\n");
			
        }
    }
}