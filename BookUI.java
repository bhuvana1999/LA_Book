package com.pdw.ui;

import java.util.Scanner;
import com.pdw.service.BookService;

public class BookUI {
public static void main(String[] args) {
	int bookId=0;
	String title="";
	float price=0;
	
	 Scanner sc= new Scanner (System.in);
	 System.out.println("enter book id");
	 bookId=sc.nextInt();
	 System.out.println("enter book title");
	 title=sc.next();
	 System.out.println("enter book price");
	 price=sc.nextFloat();
	
	BookService bs=new BookService();
	int finalresult=bs.addBook(bookId,title,price);
	System.out.println("record "+finalresult+" inserted");
	
	sc.close();
	
}
}
