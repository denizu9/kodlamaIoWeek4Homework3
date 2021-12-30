package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoap check = new KPSPublicSoapProxy();
		try {
			return check.TCKimlikNoDogrula(gamer.nationalityId, gamer.firstName.toUpperCase(), gamer.lastName.toUpperCase(), gamer.dateOfBirth);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
