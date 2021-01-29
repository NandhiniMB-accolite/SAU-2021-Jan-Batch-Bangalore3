package com.testing.assign3;

public class Bill {

private int Bid;
private int total_amnt;

int findTotalAmnt(Purchase p){
	
	total_amnt = p.purchase[0]+p.purchase[1]+p.purchase[2]+p.purchase[3]+p.purchase[4];
	return total_amnt;
	
}

String[] findAllPdts(Purchase p)
{
	return p.products;
}

}
