package com.kvvssut.interviews.questions;

import com.kvvssut.interviews.questions.programs.InterviewPrograms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class InterviewProgramsTest extends TestCase {

	public InterviewProgramsTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(InterviewProgramsTest.class);
	}

	public void testReturnInTryCatchWithoutExceptionExecutesTryReturnStatement() {
		assertEquals(1, InterviewPrograms.returnInsideTryCatchWithoutExceptionsInTry());	// Prints "Inside Finally" and then returns 1
	}
	
	public void testReturnInTryCatchWithExceptionExecutesTryReturnStatement() {
		assertEquals(2, InterviewPrograms.returnInsideTryCatchWithExceptionsInTry());	// Prints "Inside Exception" followed by "Inside Finally"
	}
	
	public void testReturnInAllExecutesFinallyBlocksReturnStatement() {
		assertEquals(3, InterviewPrograms.returnInsideTryCatchFinally());	
	}
	
}
