package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			throw new Exception("Not a valid person!");

		}

	}

}
