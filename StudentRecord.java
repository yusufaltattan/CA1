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
	public double finalScore(){
		for(int i = 0; i<this.marks.length; i++){
			finalGrade = finalGrade + this.marks[i].getFinalScore * ModuleDescriptor.con
		}
		double average = totalGrade / this.records.length;
		return average;
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
	public StudentRecord(Student student, Module module, double[] marks, double finalScore) {
		this.student = student;
		this.module = module;
		this.marks = marks;
		this.finalScore = finalScore;
	}

	// Load Data Staticly
	public static StudentRecord[] getStaticData(){
		// Create Module Descriptors
		StudentRecord anaRecord = new StudentRecord(Student Ana, Module PRG, new double[] {9,10,10,10}, finalScore);

		return new StudentRecord[]{};
	}

}
