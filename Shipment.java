class Shipment {
	public static void main(String args[]){
    String[] trackingNumbers = {"TRK001", "TRK002", "TRK003"};
    int[] weights = {5, 10, 15};
    long[] shipmentIds = {1000L, 2000L, 3000L};
    char[] statuses = {'D', 'P', 'S'};

    for (int s=0; s<trackingNumbers.length; s++) {
        System.out.println("trackingNumber: " + trackingNumbers[s]);
        System.out.println("Weight: " + weights[s]);
        System.out.println("ShipmentId: " + shipmentIds[s]);
        System.out.println("Status: " + statuses[s]);
		System.out.println("\n");
    }
}
}