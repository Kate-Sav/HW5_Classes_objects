package by.htp.task1.entity;

public class Customer implements Comparable<Customer> {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private int creditcard;
	private int account;

	public Customer() {
	}

	public Customer(String surname, String name, String patronymic, int creditcard) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.creditcard = creditcard;
	}

	public Customer(String surname, String name, String patronymic) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(int creditcard) {
		this.creditcard = creditcard;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", creditcard=" + creditcard + ", account=" + account + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account;
		result = prime * result + creditcard;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (account != other.account)
			return false;
		if (creditcard != other.creditcard)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	public int compareTo(Customer other) {

		if (surname.compareToIgnoreCase(other.surname) != 0) {
			return surname.compareToIgnoreCase(other.surname);
		} else if (name.compareToIgnoreCase(other.name) != 0) {
			return name.compareToIgnoreCase(other.name);
		} else {
			return patronymic.compareToIgnoreCase(other.patronymic);
		}

	}
}
