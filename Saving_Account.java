public class Saving_Account{
public static void bankName(){
System.out.println("BANK NAME : SBI BANK OF INDIA");
}
public static void bankHolderName(){
System.out.println("BANK HOLDER NAME :Santhosh s");
}
public static void bankBalance(){
int balance = 10000;
System.out.println("BANK BALANCE : "+balance);
}
public static void bankDebited(){
int debited = 7000;
System.out.println("DEBITED AMOUNT : "+debited);
}
public static void totalbalance(int debited, int balance){
int amount = balance-debited;
System.out.println("BANK BALANCE : "+amount);

}
}