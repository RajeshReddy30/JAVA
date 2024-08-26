public class Addition{
public static void main(String args[]){
int integer=23421;
int sum=0;
while(integer!=0){
sum=sum+integer%10;
integer=integer/10;
}
System.out.println("sum of digits is:"+sum);
}
}