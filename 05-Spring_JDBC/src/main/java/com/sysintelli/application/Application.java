package com.sysintelli.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Application {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		DriverManagerDataSource dataSource = context.getBean(DriverManagerDataSource.class);
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getString(1)+";"+rs.getString(2)+";"+rs.getString(3));
		}
		
		con.close();
	}

}
