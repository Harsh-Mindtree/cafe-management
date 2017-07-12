/**
 * 
 */
package com.mindtree.dao.jdbcimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindtree.dao.CafeFeedbackDao;
import com.mindtree.dao.DBUtil;
import com.mindtree.entity.Employee;
import com.mindtree.exceptions.DaoException;

/**
 * @author harsh
 *
 */
public class CafeFeedbackDaoImpl implements CafeFeedbackDao {

	@Override
	public String getUserType(String empEmail, String password) throws DaoException {
		String userType = "";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String query = "select emp_status from employees where emp_email = ? and emp_password = ?";
		try{
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, empEmail);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while(rs.next()){
			userType = rs.getString(1);
			}
		}catch(SQLException cause){
			throw new DaoException();
		}finally{
			DBUtil.releaseResource(conn);
			DBUtil.releaseResource(ps);
			DBUtil.releaseResource(rs);
		}
		return userType;
	}

	@Override
	public boolean saveEmployeeDetails(Employee employee) throws DaoException {
		boolean addEmployeeData = false;
		Connection conn = null;
		PreparedStatement ps = null;
		
		String query = "insert into employees values(?,?,?,?,?,default)";
		
		try{
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, employee.getEmpName());
			ps.setString(2, employee.getEmpId());
			ps.setString(3, employee.getEmpEmail());
			ps.setString(4, employee.getEmpDesignation());
			ps.setString(5, employee.getPassword());
			int save = ps.executeUpdate();
			if(save!=0){
				addEmployeeData = true;
			}
		}catch(SQLException cause){
			cause.printStackTrace();
			throw new DaoException("Data Not Inserted", cause);
		}finally {
			DBUtil.releaseResource(conn);
			DBUtil.releaseResource(ps);
		}
		return addEmployeeData;
	}
}
