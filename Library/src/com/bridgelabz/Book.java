package com.bridgelabz;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	
	Book(String title, String author, String category, int price){
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getCategory(){
		return this.category;
	}
	
	public int getPrice(){
		return this.price;
	}
}
