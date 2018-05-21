package com.kvvssut.interviews.questions;

import com.kvvssut.interviews.test.JUnitHelper;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class JUnitHelperTest extends TestCase {

	public JUnitHelperTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(JUnitHelperTest.class);
	}

	public void testReturnInTryCatchWithoutExceptionExecutesTryReturnStatement() {
		assertEquals(1, JUnitHelper.returnInsideTryCatchWithoutExceptionsInTry());	// Prints "Inside Finally" and then returns 1
	}
	
	public void testReturnInTryCatchWithExceptionExecutesTryReturnStatement() {
		assertEquals(2, JUnitHelper.returnInsideTryCatchWithExceptionsInTry());	// Prints "Inside Exception" followed by "Inside Finally"
	}
	
	public void testReturnInAllExecutesFinallyBlocksReturnStatement() {
		assertEquals(3, JUnitHelper.returnInsideTryCatchFinally());	
	}
	
}
