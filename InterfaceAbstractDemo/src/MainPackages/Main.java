package MainPackages;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.Save(new Customer(1, "Nurcan ", "Aksu", 2001, 19777905432L));
	
	}

}
