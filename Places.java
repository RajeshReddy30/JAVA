class Places{
static String places[]={"Bengaluru","hyderabad","Tirupati"};
public static void main(String args[]){
String i="Bengaluru";
for(int index=0; index<places.length;index++)
if(i==places[index])
System.out.println("matched element is:"+i);
else
System.out.println("no matched elements");
}
}