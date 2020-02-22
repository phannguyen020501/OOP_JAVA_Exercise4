package exercise4;

import java.util.List;

public class Family {
	private String address;
	private List<Person> people;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Person> getPeople() {
		return people;
	}
	public void setPeople(List<Person> people) {
		this.people = people;
	}
	public Family() {
		super();
	}
	public Family(String address, List<Person> people) {
		super();
		this.address = address;
		this.people = people;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address: "+this.address+"\nPeople: "+this.people;
	}

}
