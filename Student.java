public class Student {
	
	// Properties
	private int id;
	private String name;
	private char gender;
	private double gpa;	
	private StudentRecord[] records;
	
	// Get Functions
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public double getgpa() {
		return this.gpa;
	}
	public StudentRecord[] getStudentRecords() {
		return this.records;
	}
	
	// Set Functions
	public void setID(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public void setgpa(double gpa) {
		this.gpa = gpa;
	}
	public void setStudentRecord(StudentRecord[] records) {
		this.records = records;
	}

	// Constructors
	public Student(int id, String name, char gender, double gpa, StudentRecord[] records) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.gpa = gpa;
		this.records = records;
	}

	// Load Data Staticly
	public static Student[] getStaticData(){
		// Creating Student Properties
		Student Ana = new Student(1000, "Ana", 'F', 5.5, new StudentRecord[]{});
		Student Oliver = new Student(1001, "Oliver", 'M', 5.5, new StudentRecord[]{5});
		Student Mary = new Student(1002, "Mary", 'F', 5.5, new StudentRecord[]{5});
		Student John = new Student(1003, "John", 'M', 5.5, new StudentRecord[]{5});
		Student Noah = new Student(1004, "Noah", 'M', 5.5, new StudentRecord[]{5});
		Student Chico = new Student(1005, "Chico", 'M', 5.5, new StudentRecord[]{5});
		Student Maria = new Student(1006, "Maria", 'F', 5.5, new StudentRecord[]{5});
		Student Mark = new Student(1007, "Mark", 'X', 5.5, new StudentRecord[]{5});
		Student Lia = new Student(1008, "Lia", 'F', 5.5, new StudentRecord[]{5});
		Student Rachel = new Student(1009, "Rachel", 'F', 5.5, new StudentRecord[]{5});
		return new Student[]{Ana, Oliver, Mary, John, Noah, Chico, Maria, Mark, Lia, Rachel};
	}
	
	public String printTranscript() {
		// do something
		return "\n" + "\n" + "ID:" + Student.getid() + "Name:" + Student.getName() + "GPA:" + Student.getgpa() + "\n" + "| " + StudentRecord.getYear + 
		" | ";
	}
}

