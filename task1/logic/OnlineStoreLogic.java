package by.htp.task1.logic;

import java.util.Collections;

import by.htp.task1.entity.Customer;
import by.htp.task1.entity.OnlineStore;

public class OnlineStoreLogic {

	public void byAlphabet(OnlineStore customers) {
		Collections.sort(customers.getCustomers());
	}

	public OnlineStore creditCard(OnlineStore customers, int start, int end) {
		OnlineStore newCustomers = new OnlineStore();
		for (Customer s : customers.getCustomers())
			if (s.getCreditcard() >= start && s.getCreditcard() <= end) {
				newCustomers.add(s);
			}
		return newCustomers;
	}
}
