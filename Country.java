class Country{
public static void countryDetails(){
	System.out.println("welcome to country details");
}
public static void countryDetails(int id){
System.out.println("country id is:"+id);
}
public static void countryDetails(int id,long population){
System.out.println("country id is:"+id+"\n"+"population is:"+population);
}
public static void countryDetails(int id,long population,long males){
System.out.println("country id is:"+id+"\n"+"population is:"+population+"\n"+"males population is:"+males);
}
public static void countryDetails(int id,long population,long males,long females){
System.out.println("country id is:"+id+"\n"+"population is:"+population+"::"+"males population is:"+males);
System.out.println("females population is:"+females);
}
public static int countryDetails(int id,long population,long males,long females,char code){
System.out.println("country id is:"+id+"::"+"population is:"+population+"\n"+"males population is:"+males);
System.out.println("females population is:"+females+"country code is:"+code);
return 0;
}
public static int countryDetails(int id,long population,long males,long females,char code,float populationPercentage){
System.out.println("country id is:"+id+"::"+"population is:"+population+"::"+"males population is:"+males);
System.out.println("females population is:"+females+"country code is:"+code+"population Percentage of country is:"+populationPercentage);
return 1;
}
public static int countryDetails(int id,long population,long males,long females,char code,float populationPercentage,double femalesPercentage){
System.out.println("country id is:"+id+"::"+"population is:"+population+"::"+"males population is:"+males);
System.out.println("females population is:"+females+"country code is:"+code+"population Percentage of country is:"+populationPercentage);
System.out.println("females population is:"+femalesPercentage);
return 0;
}
public static int countryDetails(int id,long population,long males,long females,char code,float populationPercentage,double femalesPercentage,int pms){
System.out.println("country id is:"+id+"::"+"population is:"+population+"::"+"males population is:"+males);
System.out.println("females population is:"+females+"country code is:"+code+"population Percentage of country is:"+populationPercentage);
System.out.println("females population is:"+femalesPercentage+"no of pms:"+pms);
return 0;
}
public static void countryDetails(String name){
	if(name=="india")
		System.out.println("country name is:"+name);
}
public static void countryDetails(String name,String persons[]){
	String person="rajesh";
	for(int index=0;index<persons.length;index++)
	{
	if(name=="india" && person==persons[index])
		System.out.println("country name is:"+name+"person is:"+persons[index]);
}
}
public static void countryDetails(String name,String persons[]){
	String person="rajesh";
	for(int index=0;index<persons.length;index++)
	{
	if(name=="india" && person==persons[index])
		System.out.println("country name is:"+name+"person is:"+persons[index]);
}
}
}
