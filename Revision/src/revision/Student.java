package revision;

public class Student extends Person implements revision.interfaces.student {

	private String course;
	private char grade;
	
	public Student(String name, String id, String course, char grade) {
		super(name, id);
		this.course = course;
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	public void takeTest(char grade) {
		setGrade(grade);
	}

	public String toString() {
		return "Student "+ super.toString()+ "\nCourse: " + course + "\nGrade: " + grade;
	}
	
	

}
