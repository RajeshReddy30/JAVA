public class Tallest{
public static void listOfIntegers(int arr[]){
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(max<arr[i])
max=arr[i];
}
System.out.println("tallest mountain is:"+max);
}
public static void main(String args[]){
int arr[]={23,43,45,56};
Tallest.listOfIntegers(arr);
}
}