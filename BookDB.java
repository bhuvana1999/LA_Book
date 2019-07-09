package com.pdw.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class BookDB {
public static Connection getConnection1() throws Exception
{
	String driverName="oracle.jdbc.driver.OracleDriver";
	Class.forName(driverName);
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhuvana","ezhilan");
	return conn;
}
}
