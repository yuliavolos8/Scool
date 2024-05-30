package scool;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Subject {
	private int MAX_STUDENTS = 40;
	private String name;
	private Map<Student, Double> marks;
	private Teacher responsible;

	public Subject(String name, Teacher responsible) {
		this.name = name;
		this.marks = new HashMap<Student, Double>();
		this.responsible = responsible;
	}

	public boolean addStudent(Student s) {
		boolean possible = false;
		if (marks.size() < MAX_STUDENTS) {
			marks.put(s, null);
			possible = true;
		}
		return possible;
	}

	public Student isRegistered(int id) {
		Student student = null;
		for (Entry<Student, Double> entry : this.marks.entrySet()) {
			Student s = (Student) entry.getKey();

			if (id == s.getID()) {
				student = s;
			}
		}
		return student;
	}

	public boolean isRegistered(Student s) {
		return this.marks.containsKey(s);
	}

	public int numberStudents() {
		return this.marks.size();
	}

	public int getMAX_STUDENTS() {
		return this.MAX_STUDENTS;
	}

	public double getMark(Student s) throws Exception {
		double mark = 0;
		if (this.marks.containsKey(s) && s != null) {
			mark = this.marks.get(s);
		} else {
			IllegalArgumentException E = new IllegalArgumentException("Student not in the subject");
			throw E;
		}
		return mark;
	}

	public double getMeanMark() {
		double mark = 0;
		for (Entry entry : this.marks.entrySet()) {
			mark += (Double) entry.getValue();
		}
		double meanMark = mark / this.marks.size();
		return meanMark;
	}

	public void changeTeacher(Teacher t) {
		this.responsible = t;
	}

	public Teacher getTeacher() {
		return this.responsible;
	}

	public void removeStudent(Student s) {
		if (this.marks.containsKey(s)) {
			this.marks.remove(s);
		}
	}

	public void removeStudent(int id) {
		Student s = isRegistered(id);
		if (s != null) {
			this.marks.remove(s);
		}
	}

	public boolean setMark(Student s, double m) {
		boolean possible = false;
		if (this.marks.containsKey(s) && s != null && m > 0 && m <= 10) {
			this.marks.replace(s, m);
			possible = true;
		}
		return possible;
	}

	public boolean setMark(int id, Double mark) {

		Student s = isRegistered(id);
		boolean possible = setMark(s, mark);
		possible = true;
		return possible;
	}

}
