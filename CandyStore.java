public class CandyStore{
public static void chocolates(int dailyGoal,int sold){
int total=0;
if(dailyGoal>100 && sold>100){
System.out.println("you have 100 chocolates only");
}else{
total=dailyGoal+(sold-dailyGoal)*2;
}
System.out.println("total amount he made is:"+total);
}
public static void main(String args[]){
CandyStore.chocolates(10,21);
}
}