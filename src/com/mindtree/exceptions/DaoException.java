/**
 * 
 */
package com.mindtree.exceptions;

/**
 * @author harsh agarwal
 *
 */
public class DaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DaoException() {
	}

	/**
	 * @param arg0
	 */
	public DaoException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DaoException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public DaoException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
