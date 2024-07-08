class Maps{
public static void location(){
System.out.println("location is");
}
public static void location(String name){
System.out.println("location is:"+name);
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