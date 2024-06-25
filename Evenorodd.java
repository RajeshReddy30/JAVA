class Evenorodd{
public static void main(String args[])
{
int num[]={23,22,44,55,54,64,67};
int evencount=0;
int oddcount=0;
for(int index=0;index<num.length;index++)
{
if(num[index]%2==0)
{
evencount=evencount+1;
System.out.println("even numbers are:"+evencount);
}else
{
oddcount=oddcount+1;
System.out.println("odd numbers are:"+oddcount);
}
}
}
}