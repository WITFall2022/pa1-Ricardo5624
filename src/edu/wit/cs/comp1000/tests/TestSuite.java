package edu.wit.cs.comp1000.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	PA1aTestCase.class,
	PA1bTestCase.class,
})

public class TestSuite {
	
	static String intInput(int[] values) {
		final StringBuilder s = new StringBuilder();
		
		for (int i=0; i<values.length; i++) {
			s.append(String.format("%d%n", values[i]));
		}
		
		return s.toString();
	}
	
	static String stringOutput(String[] lines, Object[] values) {
		return String.format(String.join("", lines), values);
	}
	
}
