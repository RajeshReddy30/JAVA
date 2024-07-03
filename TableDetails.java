public class TableDetails {
  static String shape = "Circle";
  static String material = "Wood";
  static int legs=3;
  static String woodType = "Oak";

  public static void identifyShape() {
	  System.out.println("TABLE SHAPE:\n");
    if (shape=="Rectangle") {
      System.out.println("Shape is: "+shape);
    } else if (shape=="Square") {
      System.out.println("Shape is: "+shape);
    } else if (shape=="Circle") {
      System.out.println("Shape is: "+shape);
    } else if (shape=="Triangle") {
      System.out.println("Shape is: "+shape);
    } else {
      System.out.println("Shape is Customised");
    }
  }

  public static void checkLegsAndMaterial() {
	  System.out.println("MATERIAL USED AND TABLE LEGS:\n");
    if ( material == "Wood" && legs==3) {
      System.out.println("Materail chosen is: "+material+"\nNo. of Legs are"+legs+"\n");
    } else if (legs == 3 && material == "Metal") {
	  System.out.println("Materail chosen is: "+material+"\nNo. of Legs are"+legs+"\n");
    } else if (legs == 2 && material == "Plastic") {
	  System.out.println("Materail chosen is: "+material+"\nNo. of Legs are"+legs+"\n");
    } else if (legs == 1 && material == "Glass") {
	  System.out.println("Materail chosen is: "+material+"\nNo. of Legs are"+legs+"\n");
    } else {
      System.out.println("Materail and legs are not defined");
    }
  }

  public static void identifyWoodType() {
	  System.out.println("WOOD TYPE:\n");
   if(material=="Wood"){
     if (woodType=="Oak"){
       System.out.println("Wood Type is: "+woodType+"\n");
     } 
	 else if(woodType=="Pine"){
	   System.out.println("Wood Type is: "+woodType+"\n");
      } 
	 else if (woodType=="Maple"){
	   System.out.println("Wood Type is: "+woodType+"\n");
      } 
	 else if (woodType=="Cherry"){
	   System.out.println("Wood Type is: "+woodType+"\n");
      }
	 else {
		 System.out.println("Wood Type is not defined\n");
	 }
   }
   else
	   System.out.println("Wood Type is defined only when material chosen is Wood\n");
    }
  public static void main(String[] args){
	  System.out.println("\n__TABLE DETAILS__\n");
	  checkLegsAndMaterial();
	  identifyWoodType();
	  identifyShape();
  }

}