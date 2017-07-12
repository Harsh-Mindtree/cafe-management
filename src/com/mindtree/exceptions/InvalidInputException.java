/**
 * 
 */
package com.mindtree.exceptions;

/**
 * @author harsh agarwal
 *
 */
public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidInputException() {
	}

	/**
	 * @param arg0
	 */
	public InvalidInputException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public InvalidInputException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InvalidInputException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public InvalidInputException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
