public class Skills{
	String softSkills[]=new String[4];
	public void setSkills(String skill){
		for(int index=0;index<this.softSkills.length;index++){
			softSkills[index]=skill;
			index++;
			//System.out.println("soft skills are:"+softSkills[index]);
		}
	}
	public String readSkills(){
	for(int index=0;index<this.softSkills.length;index++){
			System.out.println("soft skills are:"+softSkills[index]);
	}return "skills";
	}
	public String deletebySkills(String skill){
	for(String skillName : softSkills){
		if(skillName==skill){
			softSkills=null;
		return "deleted skills are:"+softSkills;
		}
			
	}return "no deleted skills";
		
	}
	
	public String updatebySkills(String oldskill,String newskill){
	for(int index=0;index<this.softSkills.length;index++){
	if(softSkills[index]==oldskill){
		softSkills[index]=newskill;
		System.out.println("updated skill is:"+softSkills[index]);
	}else
		System.out.println("no updated skills");	
		
	}return "newskill updated";
	}
	public String searchbySkills(String skill){
	for(String skillName : softSkills){
		if(skillName==skill)
				System.out.println("searched element found:"+skill);
			else
	System.out.println("no searched element found");	
	}return "search element";
}}