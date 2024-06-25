class Multiofthree{
public static void main(String args[])
{
int num[]={18,9,23,24,21,2,25};
for(int index=0;index<num.length;index++)
{
if(num[index]%3==0)
{
System.out.println("given number is multiple of 3:"+num[index]);
}
else{
System.out.println("given number is not multiple of 3:"+num[index]);
}
}
}

}