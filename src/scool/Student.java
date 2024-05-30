package scool;

public class Student extends Person {
	private int id;
	private double meanMark;
	private static int studentsCounter = 0;

	public Student(String fn, String ln, PhoneNumber pn, EmailAddress e, DNI dni) {
		super(fn, ln, pn, e, dni);
		this.id = studentsCounter;
		studentsCounter++;
		this.meanMark = 0;
	}

	public Student(String fn, String ln, String pn, EmailAddress e, DNI dni) {
		super(fn, ln, pn, e, dni);
		this.id = studentsCounter;
		studentsCounter++;
		this.meanMark = 0;
	}

	public void setMeanMark(double m) {
		if (m >= 0 && m <= 10) {
			this.meanMark = m;
		}
	}

	public int getID() {
		return this.id;
	}
	
	public double getMeanMark() {
		return this.meanMark;
	}

}
