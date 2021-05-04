package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirthday;
	private String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateOfBirthday, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthday = dateOfBirthday;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(int dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
