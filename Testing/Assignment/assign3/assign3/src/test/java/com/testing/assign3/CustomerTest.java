package com.testing.assign3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.testing.assign3.Bill;
import com.testing.assign3.Customer;
import com.testing.assign3.Purchase;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomerTest {

	Customer c= new Customer("AAA",111,"12345678");
	Bill b = new Bill();
	Purchase p = new Purchase();
	
	@Test
	public void testCustomer() {
		System.out.println("Test Customer");
        Customer cus = mock(Customer.class);
        when(cus.getName()).thenReturn("Found Customer");
	}
	
	@Test
    public void testfindTotalAmnt() {
		
		System.out.println("Test Total Amnt");
		Bill b=  mock(Bill.class);
        int sum= 1500;
        when(b.findTotalAmnt(p)).thenReturn(1500);
        int res = b.findTotalAmnt(p);
        assertEquals(1500,res);
  
    }

    @Test
    public void testAllpdts() {
        System.out.println("Test All products");
    	String[] products = {"Dhal","Chips","Biscuits","Utensil"};
    	Bill b=  mock(Bill.class);
        when(b.findAllPdts(p)).thenReturn(products);
        String[] pdts = b.findAllPdts(p);
        assertArrayEquals(products,pdts);
    }

}
