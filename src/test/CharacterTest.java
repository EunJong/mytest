package test;

import junit.framework.TestCase;

public class CharacterTest extends TestCase{
	public void testWhitespace(){
		assertTrue(Character.isWhitespace('\n'));
		assertTrue(Character.isWhitespace('\t'));
		assertTrue(Character.isWhitespace(' '));
	}
	
	public void testIdentifier() {
		assertTrue(Character.isJavaIdentifierPart('_'));
		assertTrue(Character.isJavaIdentifierPart('$'));
		assertFalse(Character.isJavaIdentifierPart('^'));
		assertFalse(Character.isJavaIdentifierStart('1'));
		assertTrue(Character.isJavaIdentifierStart('_'));
	}
	
	public void testAsciiToInt()  {
		int e = Character.getNumericValue('e');
		int a = Character.getNumericValue('a');
		assertEquals(4, e-a);
	}
}
