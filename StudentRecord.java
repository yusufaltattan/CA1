public class StudentRecord {

	// Properties
	private Student student;
	
	private Module module;
	
	private double[] marks;
	
	private double finalScore;
	
	private Boolean isAboveAverage;

	// Get Functions
	public Student getStudents() {
		return this.student;
	}
	public Module getModule() {
		return this.module;
	}
	public double[] getMarks() {
		return this.marks;
	}
	public double getFinalScore() {
		return this.finalScore;
	}

	// Set Functions
	public void setStudents(Student student) {
		this.student = student;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	// Constructors
	public StudentRecord(Student student, Module module, double[] marks, double finalScore)

}
