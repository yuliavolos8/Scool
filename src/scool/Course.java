package scool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Course {

	private int MAX_SUBJECTS = 6;
	private ArrayList<Subject> subjects;
	private Teacher responsible;
	private int course;

	public Course(int course, Teacher t) {
		this.subjects = new ArrayList<>();
		this.course = course;
		this.responsible = t;
	}

	public void addSubject(Subject s) {
		if (this.subjects.size() < MAX_SUBJECTS) {
			this.subjects.add(s);
		}
	}

	public void removeStudent(Student s) {
		for (Subject subject : this.subjects) {
			subject.removeStudent(s);
		}
	}

	public boolean addStudent(Student s) {
		boolean possible = true;
		for (Subject subject : this.subjects) {
			if (!subject.isRegistered(s) && subject.numberStudents() >= subject.getMAX_STUDENTS()) {
				possible = false;
			}
		}
		if (possible) {
			for (Subject subject : this.subjects) {
				if (!subject.isRegistered(s)) {
					subject.addStudent(s);
				}
			}

		}
		return possible;
	}

	public Set<Teacher> getTeacher() {
		Set<Teacher> teachers = new HashSet<>();
		for (Subject subject : this.subjects) {
			Teacher t = subject.getTeacher();
			teachers.add(t);
		}
		return teachers;
	}

	public double meanMark() {
		double sum = 0;
		for (Subject subject : this.subjects) {
			double mark = subject.getMeanMark();
			sum += mark;
		}
		return sum / this.subjects.size();
	}
}
