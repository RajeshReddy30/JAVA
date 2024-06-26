class Vowels{
public static void main(String args[])
{
String num[]={"a","q","e","i","s","o","c","u","r","p"};
String num1[]={"a","e","i","o","u"};
for(int index=0;index<num.length;index++){
for(int i=0;i<num1.length;i++)
{
if(num[index]==num1[i])
{
System.out.println("vowles are:"+num[index]);
}
}
}
}}