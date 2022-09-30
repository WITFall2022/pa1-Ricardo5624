package edu.wit.cs.comp1000.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;

import edu.wit.cs.comp1000.PA1b;
import junit.framework.TestCase;

public class PA1bTestCase extends TestCase {
	
	@SuppressWarnings("serial")
	private static class ExitException extends SecurityException {}
	
	private static class NoExitSecurityManager extends SecurityManager 
    {
        @Override
        public void checkPermission(Permission perm) {}
        
        @Override
        public void checkPermission(Permission perm, Object context) {}
        
        @Override
        public void checkExit(int status) { super.checkExit(status); throw new ExitException(); }
    }
	
	@Override
    protected void setUp() throws Exception 
    {
        super.setUp();
        System.setSecurityManager(new NoExitSecurityManager());
    }
	
	@Override
    protected void tearDown() throws Exception 
    {
        System.setSecurityManager(null);
        super.tearDown();
    }
	
	private void _test(int inches, int eYards, int eFeet, int eInches) {
		final String input = TestSuite.intInput(new int[] {inches});
		final String output = TestSuite.stringOutput(new String[] {
			"Enter number of inches: ",
			"Yards: %d%n",
			"Feet: %d%n",
			"Inches: %d%n",
		}, new Object[] {eYards, eFeet, eInches});
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		System.setOut(new PrintStream(outContent));
		
		try {
			PA1b.main(new String[] { "foo" });
		} catch (ExitException e) {}
		assertEquals(output, outContent.toString());
		
		System.setIn(null);
		System.setOut(null);
	}
	
	public void testInches() {
		_test(0, 0, 0, 0);
		_test(1, 0, 0, 1);
		_test(2, 0, 0, 2);
		_test(10, 0, 0, 10);
	}
	
	public void testFeet() {
		_test(12, 0, 1, 0);
		_test(24, 0, 2, 0);
	}
	
	public void testYards() {
		_test(36, 1, 0, 0);
		_test(72, 2, 0, 0);
	}
	
	public void testCombo() {
		_test(13, 0, 1, 1);
		_test(37, 1, 0, 1);
		_test(48, 1, 1, 0);
		_test(49, 1, 1, 1);
		_test(63, 1, 2, 3);
		_test(133, 3, 2, 1);
	}

}
