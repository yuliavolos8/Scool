package scool;

import java.util.regex.Pattern;

public class EmailAddress {
	private String email;

	private EmailAddress(String email) {
		this.email = email;

	}

	public static EmailAddress createEmailAddress(String email) {
		String regexPattern = "^(.+)@(\\S+)$";
		boolean valid = Pattern.compile(regexPattern).matcher(email).matches();
		if (!valid) {
			email = "example@domain.com";
		}
		return new EmailAddress(email);
	}

	public String getEmail() {
		return this.email;
	}

	public boolean setEmail(String email) {
		boolean valid = false;
		EmailAddress newEmailAddress = createEmailAddress(email);
		if (!email.equals("example@domain.com")) {
			valid = true;
		}
		return valid;
	}

}
