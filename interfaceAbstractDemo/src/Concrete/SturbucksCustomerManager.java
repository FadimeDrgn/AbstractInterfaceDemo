package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;

	public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks Manager : Validation successfull.");
		}else {
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}

	}

}
