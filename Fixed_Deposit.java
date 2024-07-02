public class Fixed_Deposit{
public static void bankName(){
System.out.println("BANK NAME : MAHARASTRA BANK OF INDIA");
}
public static void bankHolderName(){
System.out.println("BANK HOLDER NAME :Santhosh s");
}
public static void depositAmount(){
int depositAmount = 100000;
System.out.println("DEPOSIT AMOUNT : "+depositAmount);
}
public static void intrest(){
 int intrest = 7;
System.out.println("INTEREST PERCENT FOR 1 YEAR : "+intrest+"%");
}
public static void monthlyProfit(int deposit, double interest){
	int totalMonth = 12;
double monthlyProfit = (deposit*interest)/totalMonth;

System.out.println("CREADIT AMOUNT MONTHLY : "+monthlyProfit);

}
}