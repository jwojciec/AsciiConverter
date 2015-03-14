package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.model.*;

public class JUnit {

	@Test
	public void testAscii() throws Exception {
		Model convTools = new Model();
		//model.convertASCII(viewer.getAsciiText());
		convTools.convertASCII("ABC");
		assertTrue(convTools.getAscii().equals("ABC"));
		assertTrue(convTools.getBin().equals("10000010100001001000011"));
		assertTrue(convTools.getDec().equals("4276803"));
		assertTrue(convTools.getHex().equals("414243"));		
		convTools = null;			
	}
	
	@Test
	public void testBin() throws Exception {
		Model convTools = new Model();
		convTools.convertBIN("10000110100001001000001");
		assertTrue(convTools.getAscii().equals("CBA"));
		assertTrue(convTools.getBin().equals("10000110100001001000001"));
		assertTrue(convTools.getDec().equals("4407873"));
		assertTrue(convTools.getHex().equals("434241"));		
		convTools = null;
	}
	
	@Test
	public void testDec() throws Exception {
		Model convTools = new Model();
		convTools.convertDEC("1179010630");
		assertTrue(convTools.getAscii().equals("FFFF"));
		assertTrue(convTools.getBin().equals("1000110010001100100011001000110"));
		assertTrue(convTools.getDec().equals("1179010630"));
		assertTrue(convTools.getHex().equals("46464646"));		
		convTools = null;
	}	
	
	@Test
	public void testHex() throws Exception {
		Model convTools = new Model();
		convTools.convertHEX("54455354");
		assertTrue(convTools.getAscii().equals("TEST"));
		assertTrue(convTools.getBin().equals("1010100010001010101001101010100"));
		assertTrue(convTools.getDec().equals("1413829460"));
		assertTrue(convTools.getHex().equals("54455354"));		
		convTools = null;
	}	
}
