class Customer {
	public static void main(String args[]){
    String[] names = {"Swe", "Nik", "Sar"};
    int[] ages = {30, 25, 35};
    long[] customerIds = {1234L, 5678L, 9101L};
    char[] membershipLevels = {'G', 'S', 'P'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Customer name: " + names[s]);
        System.out.println("Age: " + ages[s]);
        System.out.println("Customer id: " + customerIds[s]);
        System.out.println("membershipLevels: " + membershipLevels[s]);
		System.out.println("\n");
    }
}
}