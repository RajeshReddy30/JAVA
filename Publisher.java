class Publisher {
	public static void main(String args[]){
    String[] names = {"Penguin", "HarperCollins", "Random House"};
    int[] years = {1935, 1817, 1927};
    long[] booksPublished = {5000L, 3000L, 4000L};
    char[] ratings = {'A', 'A', 'B'};

    for (int s=0; s<names.length; s++) {
         System.out.println("Publisher names: " + names[s]);
        System.out.println("Year of Publish: " + years[s]);
        System.out.println("No. of Books Published: " + booksPublished[s]);
        System.out.println("Ratings: " + ratings[s]);
		System.out.println("\n");
    }
}
}