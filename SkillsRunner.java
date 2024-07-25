public class SkillsRunner{
	public static void main(String args[]){
		Skills java=new Skills();
		System.out.println("saving skills in the array");
		java.setSkills("java");
		java.setSkills("sql");
		java.setSkills("python");
		java.setSkills("css");
		System.out.println("reading the array");
		java.readSkills();
		System.out.println("deleting the skill");
		String sql=java.deletebySkills("sql");
		System.out.println(sql);
		java.updatebySkills("python","html");
		System.out.println("searching the skill");
		java.searchbySkills("java");
		
	}
}