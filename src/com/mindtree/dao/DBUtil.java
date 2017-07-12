/**
 * 
 */
package com.mindtree.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.exceptions.DaoException;


/**
 * @author M1030443
 *
 */
public class DBUtil {
	
	/**
	 * DBUtil class contains operations for establishing connection and
	 * releasing acquired resources of MySQL database
	 * 
	 * @author harsh
	 */

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/cafe_management_db";
	private static final String USER = "root";
	private static final String PWD = "root";

	/**
	 * private default constructor to prevent instantiation of utility class
	 */
	private DBUtil() {
	}

	static {
		try {
			
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return database connection
	 * @throws DaoException
	 *             if unable to establish connection
	 */
	public static Connection getConnection() throws DaoException {
		try {
			return DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException cause) {
			
			throw new DaoException("unable to get db connection", cause);
		}
	}

	/**
	 * 
	 * @param ps
	 *            statement to release
	 * @throws DaoException
	 *             if unable to release statement
	 */
	public static void releaseResource(Statement ps) throws DaoException {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException cause) {
				throw new DaoException("unable to release statement ", cause);
			}
		}
	}

	/**
	 * 
	 * @param con
	 *            connection to release
	 * @throws DaoException
	 *             if unable to release connection
	 */
	public static void releaseResource(Connection con) throws DaoException {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException cause) {
				throw new DaoException("unable to release connection ", cause);
			}
		}
	}

	/**
	 * 
	 * @param con
	 *            connection to release
	 * @throws DaoException
	 *             if unable to release connection
	 */
	public static void releaseResource(ResultSet rs) throws DaoException {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException cause) {
				throw new DaoException("unable to release rs ", cause);
			}
		}
	}
}

