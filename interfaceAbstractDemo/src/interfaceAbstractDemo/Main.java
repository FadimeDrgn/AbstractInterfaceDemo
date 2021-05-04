package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Fadime", "Durðun", 2000 , "123456789");
		BaseCustomerManager customerManager = new SturbucksCustomerManager(new CustomerCheckService() {
			
			@Override
			public boolean CheckIfRealPerson(Customer Customer) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		customerManager.save(customer1);
	}

}
