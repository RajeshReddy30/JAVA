class Book {
	public static void main(String args[]){
    String[] titles = {"Java Programming", "Python Basics", "Data Structures"};
    int[] pages = {500, 300, 450};
    long[] cost = {2652L, 3154L, 1254L};
    char[] ratings = {'A', 'B', 'A'};

    for (int s=0; s<titles.length; s++) {
        System.out.println("University names: " + titles[s]);
        System.out.println("University rankings: " + pages[s]);
        System.out.println("University enrollments: " + cost[s]);
        System.out.println("University codes: " + ratings[s]);
		System.out.println("\n");
    }
}
}