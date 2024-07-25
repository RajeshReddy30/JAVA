public class Laptop{
	String laptopNames[]=new String[4];
	int index=0;
	public int laptopNamesLength(){
		return laptopNames.length;
	}
	public String setbyBrands(String names){
		if(this.index<laptopNames.length)
			laptopNames[index]=names;
			index++;
	
	return "Brand names are:"+laptopNames[index];
	}
	public String readbybrands(){
		for(int index=0;index<laptopNamesLength();index++){
		System.out.println("Brand names are:"+laptopNames[index]);	
		}return "brands";
	}
	public String updatebyBrands(String oldnames,String newnames){
		for(int index=0;index<laptopNamesLength();index++){
			if(laptopNames[index]==oldnames){
				laptopNames[index]=newnames;
			}
		}return "updated brand is:"+laptopNames[index];
	}
	public String deletelaptopNames(String names){
		for(String name:laptopNames){
		if(name==names){
			laptopNames[index]=null;
			return "deleted brands are:"+laptopNames[index];
		}	
		}return "no deleted brands";
	}
}