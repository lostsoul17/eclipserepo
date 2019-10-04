package com.lti.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.Student;

public class StudentDao {

	public Connection connect(){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","Newuser123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}


	public void register(Student student){
		Connection conn = connect();
		PreparedStatement stmt = null;
		try {
			String sql = "insert into Student values(?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, student.getRollNo());
			stmt.setString(2, student.getFname());
			stmt.setString(3, student.getLname());
			stmt.setString(4, student.getCourse());
			stmt.setString(5, student.getResult());
			stmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Student> fetch(){
		Connection conn = connect();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{

			String sql ="SELECT * from Student";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			List<Student> list = new ArrayList<Student>();
			while(rs.next()){
				Student student = new Student();
				student.setRollNo(rs.getInt(1));
				student.setFname(rs.getString(2));
				student.setLname(rs.getString(3));
				student.setCourse(rs.getString(4));
				student.setResult(rs.getString(5));
				list.add(student);
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try{rs.close();}catch (Exception e) {}
			try{stmt.close();}catch (Exception e) {}
			try{conn.close();}catch (Exception e) {}
		}
		return null;
	}

	public int delete(int rollNo){
		Connection conn = connect();
		PreparedStatement stmt = null;
		int rs = 0 ;
		try{

			String sql ="delete from Student where rollNo=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, rollNo);
			rs = stmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
