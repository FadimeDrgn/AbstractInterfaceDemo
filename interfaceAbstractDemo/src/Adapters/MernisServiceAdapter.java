package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

		try {
					boolean result=mernisCheck.TCKimlikNoDogrula
							(Long.parseLong(customer.getNationalityId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirthday());
							return result;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

}
