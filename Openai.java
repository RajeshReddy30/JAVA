class Openai{
public static void no_of_ai(){
int ai=3;
if(ai>1)
{
System.out.println("number of ai used are more than 1");
}else
System.out.println("number of ai used are less than 1");
}
public static void nameof_ai()
{
String ai="chatgpt";
String i="chatgpt";
if(i==ai)
System.out.println("openai used is:"+ai);
else
System.out.println("openai used is:");
}
public static void cost(int rate){
	if(rate>200)
     System.out.println("cost of ai is:"+rate);
     else
		 System.out.println("cost is less than 300"+rate);

}
public static void aicustomer(String customer,String cust){
	if(customer==cust)
System.out.println("name of customer is:"+customer);
else
	System.out.println("customer name not matched with data");
}
public static boolean rate(){
	int rate=200;
	if(rate>200)
		System.out.println("rate of openai is more");
	return true;
}
public static int total_users(int users){
	if(users>100)
		System.out.println("users are more than expected i.e "+users);
	else
		System.out.println("users are less than expected ");
	return 0;
}
}