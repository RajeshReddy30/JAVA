public class Game{
	public static int info(){
	System.out.println("CLASH OF CLANS");
	return 1;
	}
	public static long users(long app_number){
	System.out.println("Total number of users:"+app_number);
	return app_number;

	}
	public static int rating(byte app_rating,double app_space){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space);
	return app_rating;
	}
	public static double grade_info(byte app_rating,double app_space,char grade){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space+"grade given:"+grade);
	return app_space;
	}
	public static boolean properties(byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_is_good;
	}
	public static String data(String app_name,byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("app Name:"+app_name+"app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_name;
	}
	

}