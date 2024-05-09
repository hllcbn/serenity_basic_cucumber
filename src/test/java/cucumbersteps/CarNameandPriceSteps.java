package cucumbersteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

public class CarNameandPriceSteps {
	
	@Before
	public void beforeHook() {
		
		System.out.println("Before hook");
	}
	
	@After
	public void afterHook() {
		
		System.out.println("After hook");
	}
	
	
	@And("^user find car name and price$")
	public void user_find_car_name_and_price() {

		System.out.println("@And -- user find car name and price");
	}

}
