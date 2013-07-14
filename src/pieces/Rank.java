package pieces;

import java.util.ArrayList;

public class Rank {
	ArrayList<Pawn> pawnlist = new ArrayList<Pawn>();

	public void initializeWhitePawn() {
		for(int i = 0; i<Board.BOARD_SIZE; i++)
			pawnlist.add(new Pawn(Pawn.WHITE_COLOR, 'p'));
	}

	public void initializeBlackPawn() {
		for(int i = 0; i<Board.BOARD_SIZE; i++)
			pawnlist.add(new Pawn(Pawn.BLACK_COLOR, 'P'));		
	}

	public void initializeEmptyPawn() {
		for(int i = 0; i<Board.BOARD_SIZE; i++)
			pawnlist.add(new Pawn(Pawn.EMPTY, '*'));
	}

	public String printRank() {
		StringBuilder pawnStr = new StringBuilder();
		for(int i= 0; i <Board.BOARD_SIZE; i++){
			pawnStr.append(pawnlist.get(i).getType());
		}
				
		return pawnStr.toString();
	}
	
	
}
