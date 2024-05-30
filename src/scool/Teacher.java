package scool;

public class Teacher extends Person {
	private final static double BASESALARy = 1500;
	private final static int EXTRAHOUR = 15;
	private final static double PERCENTAJE_FIRST_EXPIRIENCE = 0.10;
	private final static double PERCENTAJE_SECOND_EXPIRIENCE = 0.15;
	private final static double PERCENTAJE_THIRD_EXPIRIENCE = 0.20;
	private final static int FIRST_EXPIRIENCE = 3;
	private final static int SECOND_EXPIRIENCE = 10;
	private final static int THIRD_EXPIRIENCE = 20;
	private int ID;
	private static int TEACHER_COUNTER = 0;
	private double salary;
	private int yearOfExpirience;
	private CycleStudies cycle;

	public Teacher(String fn, String ln, PhoneNumber pn, EmailAddress e, DNI dni) {
		super(fn, ln, pn, e, dni);
		this.ID = TEACHER_COUNTER;
		this.TEACHER_COUNTER++;
		this.salary = BASESALARy;
		this.yearOfExpirience = 0;
		this.cycle = CycleStudies.INTERNSHIP;

	}

	public Teacher(String fn, String ln, String pn, EmailAddress e, DNI dni) {
		super(fn, ln, pn, e, dni);
		this.ID = TEACHER_COUNTER;
		this.TEACHER_COUNTER++;
		this.salary = BASESALARy;
		this.yearOfExpirience = 0;
		this.cycle = CycleStudies.INTERNSHIP;

	}

	public static double getBasesalary() {
		return BASESALARy;
	}

	public static int getExtrahour() {
		return EXTRAHOUR;
	}

	public int getID() {
		return ID;
	}

	public static int getTEACHER_COUNTER() {
		return TEACHER_COUNTER;
	}

	public double getSalary() {
		return salary;
	}

	public int getYearOfExpirience() {
		return yearOfExpirience;
	}

	public String getCicle() {
		String cicle;
		switch (this.cycle) {
		case INFANT:
			cicle = "infant";
			break;

		case PRIMARY:
			cicle = "primary";
			break;
		case SECONDARY:
			cicle = " secondary";
			break;
		case HIGHSCHOOL:
			cicle = " highscool";
			break;
		default:
			cicle = " internship";
		}
		return cicle;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public double finalOutcam(int ExtraHour) {
		double outcam = this.salary;

		if (this.yearOfExpirience >= this.FIRST_EXPIRIENCE && this.yearOfExpirience < this.SECOND_EXPIRIENCE) {
			outcam += outcam * this.PERCENTAJE_FIRST_EXPIRIENCE;
		} else if (this.yearOfExpirience >= this.SECOND_EXPIRIENCE && this.yearOfExpirience < this.THIRD_EXPIRIENCE) {
			outcam += outcam * this.PERCENTAJE_SECOND_EXPIRIENCE;
		} else if (this.yearOfExpirience >= this.THIRD_EXPIRIENCE) {
			outcam += outcam * this.PERCENTAJE_THIRD_EXPIRIENCE;
		}
		if( ExtraHour > 0) {
			outcam += this.EXTRAHOUR*ExtraHour; 
		}
		return outcam;
	}
}