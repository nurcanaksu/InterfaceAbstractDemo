package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
