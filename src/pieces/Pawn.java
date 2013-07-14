package pieces;

public class Pawn {
	
	public static final String WHITE_COLOR = "white";
	public static final String BLACK_COLOR = "black";
	public static final String EMPTY = "";
		
	
	public String color;
	public char type;
	
	public Pawn(){}
	
	public Pawn(String color, char type){
		this.color = color;
		this.type = type;
	}

	public String getColor() {
		return this.color;							
	}
	
	public char getType(){
		return this.type;
	}
	
}
