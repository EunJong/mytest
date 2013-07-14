package pieces;

import java.util.ArrayList;


public class Board {

	private ArrayList<Rank> rankList = new ArrayList<Rank>();
	public static final int BOARD_SIZE = 8;
	public static final String NEWLINE = System.getProperty("line.separator"); 
	int pawnCount =0;
	
	public void initialize(){
		rankList.clear();
		for(int i=0; i <Board.BOARD_SIZE; i++){
			Rank rank = new Rank();
			if(i == 1)
				rank.initializeWhitePawn();
			else if( i == 6)
				rank.initializeBlackPawn();
			else
				rank.initializeEmptyPawn();
			rankList.add(rank);
		}
		
	
	}
	
	public Rank getRankList(int i){
		return rankList.get(i);
	}

	public String printBoard() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i<BOARD_SIZE; i++){
			builder.append(getRankList(i).printRank());
			builder.append(Board.NEWLINE);
		}
		return builder.toString();
	}
	
	
	/*
	public void addPawn(Pawn pawn) {
		pawnList.add(pawn);
		pawnCount++;
	}

	public int getPawnCount() {
		return pawnList.size();
	}

	public ArrayList<Pawn> getAllPawns() {
		return pawnList;
	}
	*/
}
