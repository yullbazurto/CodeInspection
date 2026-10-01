package labcodeinspection;

import java.util.Locale;

public class Email {

	private static final int PASSWORD_LENGTH = 8;

	private final String firstName;
	private final String lastName;
	private String password;
	private String department;
	private String email;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARTMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDepartment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "general";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			chars[i] = set.charAt(rand);
		}
		return new String(chars);
	}

	public void generateEmail() {
		this.password = this.randomPassword(PASSWORD_LENGTH);
		this.email = this.firstName.toLowerCase(Locale.ROOT) + this.lastName.toLowerCase(Locale.ROOT) + "@"
				+ this.department + ".espol.edu.ec";
	}
}