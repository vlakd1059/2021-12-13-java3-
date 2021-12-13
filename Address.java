package Exam02;

public class Address {
	private String Name;
	private int Age;
	private String phoneNumber;

	public Address(String getName, int getAge, String getPhoneNumber) {
		super();
		this.Name = getName;
		this.Age = getAge;
		this.phoneNumber = getPhoneNumber;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public String getNumber() {
		return phoneNumber;
	}
}