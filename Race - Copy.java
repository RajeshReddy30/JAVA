public class Race{
public static void time(double x,double y, double z){
double distance=400;
double aliceSpeed=0;
double bobSpeed=0;
double charlieSpeed=0;
if(x==y||y==z||x==z){
System.out.println("time should be distinct");
}else{
aliceSpeed=distance/x;
bobSpeed=distance/y;
charlieSpeed=distance/z;
if(aliceSpeed>bobSpeed && aliceSpeed> charlieSpeed){
System.out.println("alice speed is highest:"+aliceSpeed);
}else if(bobSpeed>charlieSpeed){
System.out.println("bob speed is highest:"+bobSpeed);

}
else
System.out.println("charlie speed is highest:"+charlieSpeed);
}
}
public static void main(String args[]){
Race.time(231,432,341);
}
}