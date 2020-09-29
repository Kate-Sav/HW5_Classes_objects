package by.htp.task1.main;

import by.htp.task1.entity.Customer;
import by.htp.task1.entity.OnlineStore;
import by.htp.task1.logic.OnlineStoreLogic;
import by.htp.task1.viewer.Viewer;

public class Main {
	public static void main(String []args) {
		
		OnlineStore store = new OnlineStore();
		Customer c1 = new Customer("Petrov", "Ivan", "Ivanovich", 548952);
		Customer c2 = new Customer("Lapov", "Ivan", "Ivanovica", 480949);
		Customer c3 = new Customer("Dvanov", "Ihor", "Petrovich", 548952);
		store.add(c1);
		store.add(c2);
		store.add(c3);
		OnlineStoreLogic logic= new OnlineStoreLogic();
		Viewer viewer = new Viewer();
		logic.byAlphabet(store);
		viewer.printFullName(store);
		logic.creditCard(store, 400000, 500000);
		System.out.println();
		viewer.printFullName(store);
		
	}
}
