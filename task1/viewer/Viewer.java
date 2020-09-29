package by.htp.task1.viewer;

import by.htp.task1.entity.Customer;
import by.htp.task1.entity.OnlineStore;

public class Viewer {
	public void printFullName(OnlineStore customers) {

		for (Customer s : customers.getCustomers()) {
			System.out.println((s.getSurname() + " " + s.getName() + " " + s.getPatronymic()));
		}
	}

}
