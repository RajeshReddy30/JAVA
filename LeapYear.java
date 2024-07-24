public class LeapYear{
	public boolean isLeapYear(int year){
		if(year % 4 == 0 && year % 100 != 0){
			//System.out.println("true");
			return true;
		}else{
			System.out.println("false");
		return false;
	}}
}