public class Addition_Runner{
public static void main(String args[])
{
System.out.println("first number is:"+Addition.num1);
System.out.println("second number is:"+Addition.num2);
Addition.sum=Addition.num1+Addition.num2;
System.out.println("sum of two numbers is:"+Addition.sum);
if(Addition.sum==Addition.num1)
System.out.println("sum is equal to first number");
else
System.out.println("sum is not equal to first number");



}
}