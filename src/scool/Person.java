package scool;

public class Person {

	private String firstName;
	private String lastName;
	private PhoneNumber phoneNumber;
	private EmailAddress email;
	private DNI dni;

	public Person(String fn, String ln, PhoneNumber pn, EmailAddress e, DNI dni) {
		this.firstName = fn;
		this.lastName = ln;
		this.phoneNumber = pn;
		this.email = e;
		this.dni = dni;
	}

	public Person(String fn, String ln, String pn, EmailAddress e, DNI dni) {
		this.firstName = fn;
		this.lastName = ln;
		this.phoneNumber = PhoneNumber.createPhoneNumber(pn);
		this.email = e;
		this.dni = dni;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public EmailAddress getEmail() {
		return email;
	}

	public DNI getDni() {
		return dni;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPhoneNumber(String prefix, String number) {
		this.phoneNumber.setNumber(prefix);

	}

	public void setEmail(String email) {
		this.email.setEmail(email);
	}

	public void setID(DNI dni) {
		this.dni = dni;
	}
}
