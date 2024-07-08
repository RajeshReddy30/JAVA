class Ola{
public static void location(){
String name="btm";
System.out.println("location is:"+name);
}
public static void location(String username){
System.out.println("location is:"+username);
}
public static int location(int locations){
System.out.println("Total locations are:"+locations);
return 0;
}
public static void location(String directions[]){
for(int index=0;index<directions.length;index++)
System.out.println("directiond are:"+directions[index]);
}
}