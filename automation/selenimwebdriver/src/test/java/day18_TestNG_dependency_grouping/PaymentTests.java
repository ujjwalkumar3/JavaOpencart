package day18_TestNG_dependency_grouping;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees....");
	}
	
	//add extra functional because if want to run only sanity and regression at that time we need that
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentinDollars()
	{
		System.out.println("payment in dollars....");
	}
	
}
