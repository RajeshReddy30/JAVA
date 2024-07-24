public class Student{
	String name;
	int age;
	char grade;
	public Student(String name,int age,char grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
		System.out.println("Student details are....");
	}
	public void displayStudentDetails(){
		System.out.println("name of student is:"+this.name+"\n"+"age is:"+this.age+"\n"+"grade is:"+this.grade);
	}
}