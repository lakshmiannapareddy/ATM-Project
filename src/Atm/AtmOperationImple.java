package Atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//concrete implementing  subclass
public class AtmOperationImple implements AtmInterface {
      
	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("AvailableBalance"+atm.getBalance());
		
		
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("collect the cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount, "Amount withdraw");
				viewBalance();
			}
			else {
				System.out.println("Insuffient balance");
			}
			
		}
		else {
			System.out.println("enter the amount in terms of 500");
		}
		
	}
	@Override
	public void dipositAmount(double dipositAmount) {
		System.out.println("dipositedAmount is:"+dipositAmount);
	       atm.setBalance(atm.getBalance()+dipositAmount);
	       ministmt.put(dipositAmount, "Deposited SucessFully");
	       viewBalance();
	       
	}

	@Override
	public void viewMiniStatement() {
		Set<Double>set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
		
	}

}
