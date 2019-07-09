package com.pdw.service;

import com.pdw.beans.BookBean;
import com.pdw.dao.BookDao;

public class BookService implements BookServiceI {
	public int addBook(int bookId,String title, float price)
	{
	String grade="";
	if(price<=300)
	{
		grade="C";
	}
	else if(price<=600)
	{
		grade="B";
	}
	else
	{
		grade="A";
	}
	BookDao bookDao=new BookDao();
	BookBean bookbean=new BookBean();
	
	bookbean.setBookId(bookId);
	bookbean.setTitle(title);
	bookbean.setPrice(price);
	bookbean.setGrade(grade);
	
	int finalresult=0;
	try {
		finalresult=bookDao.addBook(bookbean);
		return finalresult;
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
		return 0;
	}
	
	
	}

}
