/**
 * 
 */
package com.mindtree.services;

import com.mindtree.dao.CafeFeedbackDao;
import com.mindtree.dao.jdbcimpl.CafeFeedbackDaoImpl;
import com.mindtree.entity.Employee;
import com.mindtree.exceptions.DaoException;
import com.mindtree.exceptions.InvalidUserException;
import com.mindtree.exceptions.ServiceException;

/**
 * @author harsh
 *
 */
public class CafeFeedbackService {
	
	CafeFeedbackDao feedbackDao = null;

	public String getUserType(String empEmail, String password) throws ServiceException {
		feedbackDao = new CafeFeedbackDaoImpl();
		String userType = "";
		try {
			userType = feedbackDao.getUserType(empEmail,password);
		}catch(DaoException e) {
			throw new ServiceException("Invalid user");
		}
		return userType;
	}

	public boolean saveEmployeeDetails(Employee employee) throws ServiceException {
		feedbackDao = new CafeFeedbackDaoImpl();
		boolean saveDetails = false;
		try {
			saveDetails = feedbackDao.saveEmployeeDetails(employee);
		} catch (DaoException e) {
			throw new ServiceException();	
		}
		return saveDetails;
	}
}
