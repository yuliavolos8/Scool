package scool;

public class PhoneNumber {

	private String number;
	private String prefix;

	public PhoneNumber(String prefix, String number) {
		this.number = number;
		this.prefix = prefix;
	}

	public static PhoneNumber createPhoneNumber(String prefix, String number) {
		if (prefix.charAt(0) != '+' || !chekNumber(number)) {
			prefix = "+00";
			number = "000 000 000";
		}

		return new PhoneNumber(prefix, number);

	}

	public static PhoneNumber createPhoneNumber(String number) {
		String prefix = "+34";
		if (!chekNumber(number) || number.length() != 9) {
			prefix = "+00";
			number = "000 000 000";

		}
		return new PhoneNumber(prefix, number);
	}

	public static boolean chekNumber(String number) {
		number = number.replace(" ", "");
		boolean valid = true;
		try {

			Integer.parseInt(number);
		} catch (Exception e) {
			valid = false;
		}
		return valid;

	}

	public String getNumber() {
		return this.number;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setNumber(String number) {

		this.number = number;

	}

	public boolean setCorrectPrefix(String prefix) {
		boolean valid = false;

		if (!prefix.equals("+00")) {
			valid = true;
			this.prefix = prefix;

		}
		return valid;
	}
}
