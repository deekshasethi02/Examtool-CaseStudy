package com.yash.examtool.exception;
/**
 * this is responsible to send testIdentifier as a response while exception
 * @author deeksha.sethi
 *
 */
public class TestIdExceptionResponse {
	private String testIdentifier;

	public TestIdExceptionResponse(String testIdentifier) {
		super();
		this.testIdentifier = testIdentifier;
	}
	
	public String getTestIdentifier() {
		return testIdentifier;
	}

	public void setTestIdentifier(String testIdentifier) {
		this.testIdentifier = testIdentifier;
	}
	
	
}
