package test;

import junit.framework.TestCase;
import pieces.Rank;

public class RankTest extends TestCase{

	public static final String WHITE_PAWN_STRING = "pppppppp";
	public static final String BLACK_PAWN_STRING = "PPPPPPPP";
	public static final String EMPTY_PAWN_STRING = "********";
	
	public void testInitializeWhitePawn(){
		Rank rank = new Rank();
		rank.initializeWhitePawn();
		assertEquals(RankTest.WHITE_PAWN_STRING, rank.printRank());
	}
	
	public void testInitializeBlackPawn(){
		Rank rank = new Rank();
		rank.initializeBlackPawn();
		assertEquals(RankTest.BLACK_PAWN_STRING, rank.printRank());
	}
	
	public void testInitializeEmptyPawn(){
		Rank rank = new Rank();
		rank.initializeEmptyPawn();
		assertEquals(RankTest.EMPTY_PAWN_STRING, rank.printRank());
	}
}

