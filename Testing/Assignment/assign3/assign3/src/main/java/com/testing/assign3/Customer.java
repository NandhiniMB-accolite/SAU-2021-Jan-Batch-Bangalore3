package com.testing.assign3;

public class Customer {

	private String name;
	private int id;
	private String phone;
	int[] purchase = {100,500,300,700};
	String[] products = {"Dhal","Chips","Biscuits","Utensil"};
	
	

	public Customer(String name, int id, String phn) {
		
		this.name = name;
		this.id = id;
		this.phone = phn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
//	public static void main(String[] args) {
//		Customer c= new Customer("AAA",111,"12345678");
//	    Bill b= new Bill();
//	    b.findTotalAmnt(purchase);
//	    String[] res = b.findAllPdts(purchase);
//	    
//		
//	}
	
}
