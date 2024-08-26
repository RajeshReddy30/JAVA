public class Reminder{
public static void reminder(int a,int b){
int num=0;
num=a%b;
System.out.println("reminder when a is divided by b is:"+num);
}
public static void main(String args[]){
Reminder.reminder(12,5);
}
}