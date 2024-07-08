public class Paytm{
public static void home(){
System.out.println("welcome to home page");
}
public static void home(String name){
System.out.println("name of the receiver:"+name);
}
public static String home(String contacts[]){
for(int index=0;index<contacts.length;index++)
System.out.println("contacts in paytm:"+contacts[index]);
return "nl";
}
public static String home(String fastag){

System.out.println("fastag is:"+fastag);
return "xgfh";
}
}