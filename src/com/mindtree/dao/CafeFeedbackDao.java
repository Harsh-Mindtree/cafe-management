/**
 * 
 */
package com.mindtree.dao;

import com.mindtree.entity.Employee;
import com.mindtree.exceptions.DaoException;

/**
 * @author harsh
 *
 */
public interface CafeFeedbackDao {

	String getUserType(String empEmail, String password) throws DaoException;

	boolean saveEmployeeDetails(Employee employee) throws DaoException;

}
