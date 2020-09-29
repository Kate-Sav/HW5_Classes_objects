package by.htp.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
	private List<Customer> customers = new ArrayList<Customer>();

	public OnlineStore() {
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public Customer getCustomer(int i) {
		return customers.get(i);
	}

	public void add(Customer customer) {
		customers.add(customer);
	}

}
