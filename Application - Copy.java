class Application{
public static String applock(){
System.out.println("welcome to application");
return "app";
}
public static String applock(String username){
System.out.println("the username is:"+username);
return username;
}
public static String applock(String username,String password){
System.out.println("the username is:"+username+"password is:"+password);
return password;
}
public static String applock(String name,String username,String password){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name);
return password;
}
public static String applock(String name,String username,String password,long mobile){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name+"mobile number is:"+mobile);
return password;
}
public static String applock(String name,String username,String password,long mobile,String content){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name+"mobile number is:"+mobile);
System.out.println("app content is:"+content);
return password;
}
public static int applock(String name,String username,String password,long mobile,String content,int rating){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name+"mobile number is:"+mobile);
System.out.println("app content is:"+content+"app rating is:"+rating);
return 0;
}
public static int applock(String name,String username,String password,long mobile,String content,int rating,int storage){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name+"mobile number is:"+mobile);
System.out.println("app content is:"+content+"app rating is:"+rating+"app storage is:"+storage);
return 0;
}
public static int applock(String name,String username,String password,long mobile,String content,int rating,int storage,String developer){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name+"mobile number is:"+mobile);
System.out.println("app content is:"+content+"app rating is:"+rating+"app storage is:"+storage+"developer nameis:"+developer);
return 0;
}
public static int applock(String name,String username,String password,long mobile,String content,int rating,int storage,String developer,String company){
System.out.println("the username is:"+username+"password is:"+password+"app name is :"+name+"mobile number is:"+mobile);
System.out.println("app content is:"+content+"app rating is:"+rating+"app storage is:"+storage+"developer nameis:"+developer+"company is:"+company);
return 0;
}}