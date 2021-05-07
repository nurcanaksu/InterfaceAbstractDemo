package Concrete;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class CustomerCheckService implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	


}
