package test;

import java.util.ArrayList;

import pieces.Board;
import pieces.Pawn;

import junit.framework.TestCase;

public class TestBoard extends TestCase{
	
	public void testBoard(){
		
		Board board = new Board();
		board.initialize();
		assertEquals(RankTest.EMPTY_PAWN_STRING + Board.NEWLINE
				+RankTest.WHITE_PAWN_STRING+ Board.NEWLINE
				+RankTest.EMPTY_PAWN_STRING+ Board.NEWLINE
				+RankTest.EMPTY_PAWN_STRING+ Board.NEWLINE
				+RankTest.EMPTY_PAWN_STRING+ Board.NEWLINE
				+RankTest.EMPTY_PAWN_STRING+ Board.NEWLINE
				+RankTest.BLACK_PAWN_STRING+ Board.NEWLINE
				+RankTest.EMPTY_PAWN_STRING+ Board.NEWLINE,
				board.printBoard());
		System.out.println(board.printBoard());
		
		
//		board.addPawn(new Pawn(Pawn.BLACK_COLOR));
//		assertEquals(1, board.getPawnCount());
//		
//		board.addPawn(new Pawn(Pawn.WHITE_COLOR));
//		//board.addPawn(new Integer(7));
//		assertEquals(2, board.getPawnCount());
//		
	//	ArrayList<Pawn> pawnlist = board.getAllPawns();
		
	//	assertEquals(Pawn.BLACK_COLOR, pawnlist.get(0).getColor());
	//	assertEquals(Pawn.WHITE_COLOR, pawnlist.get(1).getColor());
		
	}
}
