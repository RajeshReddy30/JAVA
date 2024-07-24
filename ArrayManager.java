public class ArrayManager{
	int arrayNumbers[]={1,4,6,7};
	public void insert(){
		for(int index=0;index<arrayNumbers.length;index++){
		if(arrayNumbers[index]==4)
		{
			System.out.println("searched element is found:4");
		}else{
			System.out.println("searched element not found");
			}
			
		}
arrayNumbers[2]=3;
System.out.println("inserted element is:"+arrayNumbers[2]);	
	}
}