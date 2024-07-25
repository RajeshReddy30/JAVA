public class Electronics{
String electronicNames[] = new String[5];
int index = 0;

public int arrLength(){
	return electronicNames.length;
}
public String creatByElectronicsNames(String names){
	if(this.index<this.arrLength()){
	electronicNames[index]=	names;
	index++;
	}
	return "Cannot Updates Array is Full";
}
public void readByElectronicsNames(){
	for(int i=0; i<this.arrLength() ; i++){
		System.out.println("Electronics are :"+electronicNames[i]);
	}
}
public String updatedByElectronicsNames(String oldName, String newName){
	for(int i=0; i<this.arrLength() ; i++){
		if(electronicNames[i]==oldName){
			electronicNames[i]=newName;
			System.out.println("Electronics are :"+electronicNames[i]);
			return "updated Successfully";

		}
		System.out.println("Electronics are :"+electronicNames[i]);
}
return "updated failed";
}
public String deleatByElectronicsNames (String names){
	for(int i=0; i<this.arrLength() ; i++){
		if(electronicNames[i]==names){
			electronicNames[i]=null;
			System.out.println("Electronics are :"+electronicNames[i]);
			return "Deleted Successfully";
      }
	}
	return "Not found to delete";
}
public String SearchByElectronicsNames (String names){
for(String name :electronicNames ){
	if(names == name){
		return "Found :"+names;
	}
}
return "Search result not found";
}
}
