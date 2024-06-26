class Orders {
	public static void main(String args[]){
    String[] ids = {"ORD001", "ORD002", "ORD003"};
    int[] quantities = {2, 5, 3};
    long[] prices = {250L, 500L, 750L};
    char[] statuses = {'P', 'C', 'S'};

    for (int s=0; s<ids.length; s++) {
        System.out.println("Order Id: " + ids[s]);
        System.out.println("Quantities: " + quantities[s]);
        System.out.println("Price Rs: " + prices[s]);
        System.out.println("Status: " + statuses[s]);
		System.out.println("\n");
    }
}
}