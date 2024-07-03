public class Chess {
  static String piece = "pawn";
  static String move="horizontal";
  static String no_of_square="More than one";
  static String piece_moved="king";

  public static void makeMove() {
	 System.out.println("-----Move Making-----");
    if (piece == "King") {
    System.out.println("You choosed :"+piece+"\n Move the king");
    } else if (piece == "Queen") {
      System.out.println("You choosed :"+piece+"\n Move the queen ");
    } else if (piece =="Rook") {
      System.out.println("You choosed :"+piece+"\n Moov the Rook");
    } else if (piece == "Bishop") {
      System.out.println("You choosed :"+piece+"\n Move The Bishop");
    } else {
       System.out.println("Move Pawn\n");
    }
}

  public static void checkValidation() {
	System.out.println("-----Validity Check-----");  
    if (piece=="pawn" && (move=="diagonal"||move=="horizontal"||move=="vertical")&& no_of_square=="1") 
	{
      System.out.println("Piece is: "+piece+"\n Move "+move+" is valid");
    }
	else if (piece=="knight" && move=="L-Shape" && no_of_square=="5") 
	{
      System.out.println("Piece is: "+piece+"\n Move "+move+" is valid");
    } 
	else if (piece=="bishop" && no_of_square=="More than one" && move=="diagonal") 
	{
      System.out.println("Piece is: "+piece+"\n Move "+move+" is valid");
	} 
	else if (piece=="rook" && (move=="horizontal"||move=="vertical") && no_of_square=="More than one")
	{
      System.out.println("Piece is: "+piece+"\n Move "+move+" is valid");
	}
	else if (piece=="King" && (move=="horizontal"||move=="vertical" || move=="diagonal") && no_of_square=="1")
	{
      System.out.println("Piece is: "+piece+"\n Move "+move+" is valid");
	}
	else if (piece=="Queen" && (no_of_square=="More than one" || no_of_square=="1") && (move=="horizontal"||move=="vertical" || move=="diagonal")) {
      System.out.println("Piece is :"+piece+"\n Move "+move+" is valid");
	}
	else{
		System.out.println("Move is Invalid");
	}
  }

  public static void updateBoard() {
	System.out.println("-----Board Update-----");
    if (piece_moved=="knight") {
      System.out.println("You moved a knight");
    } else if (piece_moved=="bishop") {
      System.out.println("You moved a bishop");
    } else if (piece=="rook") {
      System.out.println("You moved a rook");
    } else if (piece=="Queen") {
      System.out.println("You moved a Queen");
    } else if(piece_moved=="King"){
	  System.out.println("You moved a King");
    } else if(piece_moved=="pawn"){
	  System.out.println("You moved a pawn");
    }
    }
    public static void main(String[] args){
	  System.out.println("\n_____Chess_____\n");
	  makeMove();
	  checkValidation();
	  updateBoard();

  }
}