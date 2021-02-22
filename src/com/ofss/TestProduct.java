package com.ofss;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stock stk[]= new Stock[2];
//		 stk[0] = new Stock(100,"ORCL",3500.43);
//		 stk[1] = new Stock(200,"IBM",435.43);
		
		Stock stk[]= {new Stock(100,"ORCL",3500.43),new Stock(200,"IBM",435.43)};
		Customer cust = new Customer("Raghu", stk);
		
		System.out.println(cust);
		
		double maxPrice=0.0;
		String maxPricedStock="";
		
		// Let's use for loop
		for (int i=0;i<stk.length;i++)
		{
			if (stk[i].getStockPrice()>maxPrice)
			{
				maxPrice=stk[i].getStockPrice();
				maxPricedStock=stk[i].getStockName();
			}
			
		}
		
		System.out.println("The stock name with the highest price is "+maxPricedStock+" and price is "+maxPrice);

		

	}

}
