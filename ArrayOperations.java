public class ArrayOperations{
	int array[]={1,2,12,4,5,6,7,8,9};
	
	public void display(){
		for(int index=0;index<array.length;index++)
			System.out.println("array elements are:"+array[index]);
	}
	public void update(){
		this.array[2]=5;
		System.out.println("updated element is:"+array[2]);
	}
	public void find(){
		for(int index=0;index<array.length;index++){
		if(4==this.array[index])
			System.out.println("element found:4");
	}
}
}