package com.pdw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pdw.beans.BookBean;

public class BookDao {
	public int addBook(BookBean bookbean)
	{
     Connection con=null;
     PreparedStatement pstmt=null;
     try
     {
    	 con=BookDB.getConnection1();
    	 String ins_str="insert into book values(?,?,?,?)";
    	 
    	 pstmt=con.prepareStatement(ins_str);
    	 
    	 pstmt.setInt(1, bookbean.getBookId());
    	 pstmt.setString(2, bookbean.getTitle());
    	 pstmt.setFloat(3, bookbean.getPrice());
    	 pstmt.setString(4,bookbean.getGrade());
    	 
    	 int finalresult=pstmt.executeUpdate();
    	 con.close();
    	  return finalresult;
    	 
     }
     catch (Exception e)
     {
    	 System.out.println(e);
    	 return 0;
     }
	
  
	}

}
