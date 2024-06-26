class Product {
	public static void main(String args[]){
    String[] names = {"Laptop", "Smartphone", "Tablet"};
    int[] stock = {50, 100, 75};
    long[] ids = {101L, 102L, 103L};
    char[] ratings = {'A', 'B', 'A'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Product name: " + names[s]);
        System.out.println("Stock: " + stock[s]);
        System.out.println("ids: " + ids[s]);
        System.out.println("ratings: " + ratings[s]);
		System.out.println("\n");
    }
}
}