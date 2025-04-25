package com.yw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yw.model.Employee;

@Repository("empDAO")
public class EmployeeImplDAO implements IEmployeeDAO {

	private static final String GET_EMP_BY_DESIG = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN(?,?,?)";
	
	List<Employee> list = null;
	
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> getEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception {
		try(
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESIG);				
			){
			
			ps.setString(1, desig1);
			ps.setString(2, desig2);
			ps.setString(3, desig3);
			
			try(
					ResultSet rs = ps.executeQuery();
				){
				
				list = new ArrayList();
				
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
