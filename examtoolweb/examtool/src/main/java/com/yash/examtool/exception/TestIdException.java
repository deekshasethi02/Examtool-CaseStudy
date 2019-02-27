package com.yash.examtool.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * This exception is responsible to send error message whenever test id is not found
 * @author deeksha.sethi
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TestIdException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public TestIdException(String message) {
		super(message);
	}
}
