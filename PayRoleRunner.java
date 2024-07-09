class PayRoleRunner{
public static void main(String args[]){
		PayRole.processPayment();
        PayRole.processPayment("E123");
        PayRole.processPayment("E123", 1500.00);
        PayRole.processPayment("E123", 1500.00, "2024-07-09");
        PayRole.processPayment("E123", 1500.00, "2024-07-09", "HR");
        PayRole.processPayment("E123", 1500.00, "2024-07-09", "HR", "Manager");
        PayRole.processPayment("E123", 1500.00, "2024-07-09", "HR", "Manager", "123-456-789");
        PayRole.processPayment("E123", 1500.00, "2024-07-09", "HR", "Manager", "123-456-789", "Direct Deposit");
        PayRole.processPayment("E123", 1500.00, "2024-07-09", "HR", "Manager", "123-456-789", "Direct Deposit", "500.00");
        PayRole.processPayment("E123", 1500.00, "2024-07-09", "HR", "Manager", "123-456-789", "Direct Deposit", "500.00", "100.00");
        

}
}