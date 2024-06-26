class Department {
	public static void main(String args[]){
    String[] dNames = {"CSE", "ECE", "CIVIL"};
    int[] dCodes = {101, 102, 103};
    long[] budgets = {50000L, 30000L, 40000L};
    char[] initials = {'C', 'E', 'C'};

    for (int s=0; s<dNames.length; s++) {
        System.out.println("Department names: " + dNames[s]);
        System.out.println("Department codes: " + dCodes[s]);
        System.out.println("Department budgets: " + budgets[s]);
        System.out.println("Department initials: " + initials[s]);
		System.out.println("\n");
    }
}
}