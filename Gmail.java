public class Gmail {
  static String accountType = "Personal";
  static boolean isPersonal = true;
  static boolean isBusiness = false;
  static boolean isStudent = false;
  static boolean isWorkPurpose = false;
  static boolean hasPassword = true;
  static boolean has2FA = true;

  public static void identifyAccountType() {
	  System.out.println("ACCOUNT TYPE:");
    if (accountType=="Personal") {
       System.out.println("Account Type is: "+accountType+"\n");
    } else if (accountType=="Business") {
      System.out.println("Account Type is: "+accountType+"\n");
    } else if (accountType=="Student") {
      System.out.println("Account Type is: "+accountType+"\n");
    } else if (accountType=="Teacher") {
      System.out.println("Account Type is: "+accountType+"\n");
    } 
	else {
      System.out.println("Account Type Not Determined\n");
  }
}


  public static void checkSecurity() {
	  System.out.println("ACCOUNT SECURITY:");
    if (hasPassword == true) {
      System.out.println("Account has password\n");
    } 
	else {
      System.out.println("Account does not have password");
    }
    if (has2FA == true) {
      System.out.println("Account has 2FA");
    } 
	else {
      System.out.println("Account does not have 2FA");
    }
	if(hasPassword == true && has2FA == true){
		System.out.println("Account is highly safe and Authenticated!");
	}
	else{
		System.out.println("Account is not that safe");
	}
	if (hasPassword == false && has2FA == false){
		System.out.println("Account is at high risk");
	}
  }


  public static void checkAccountStatus() {
	  System.out.println("ACCOUNT STATUS:");
    if (isPersonal == true) {
      System.out.println("Account is Personal and kept Active\n");
    } else if (isBusiness == true) {
      System.out.println("Account is a Business account and Active\n");
    } else if (isStudent == true) {
      System.out.println("Account is a student account and Active\n");
    } else if (isWorkPurpose == true) {
      System.out.println("Account is Professional and Active\n");
    } else {
      System.out.println("Account is Inactive\n");
    }
  }
public static void main(String[] args){
	  System.out.println("\n__Gmail__\n");
	  identifyAccountType();
	  checkAccountStatus();
	  checkSecurity();
  }

}