class Uber{
public static void distance(){
int distance=3;
System.out.println("distance to travel:"+distance);
}
public static void distance(String user){
System.out.println("User name is:"+user);

} 
public static void distance(String password){
System.out.println("password is:"+password);
}
public static void distance(String directions[]){
for(int index=0;index<directions.length;index++)
System.out.println("directiond are:"+directions[index]);
}
}