public class University {

	// Properties
	private ModuleDescriptor[] moduleDescriptors;
	private Student[] students;
	private Module[] modules;

	// Get Functions
	public ModuleDescriptor[] getmoduleDescriptors(){
		return this.moduleDescriptors;
	}
	public Student[] getStudents(){
		return this.students;
	}

	// Set Functions
	public void setmoduleDescriptors(ModuleDescriptor[] moduleDescriptors){
		this.moduleDescriptors = moduleDescriptors;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}

	// Length of...
	public int getNumberOfModules(){
		var x = getmoduleDescriptors();
		return x.length;
	}

	/**
	 * @return The number of students registered in the system.
	 */
	public int getTotalNumberStudents() {
		// TODO - needs to be implemented
		var x = getStudents();
		return x.length;
	}

	/**
	 * @return The student with the highest GPA.
	 */
	public Student getBestStudent() {
		// TODO - needs to be implemented
		return null;
	}

	/**
	 * @return The module with the highest average score.
	 */
	public Module getBestModule() {
		// TODO - needs to be implemented
		return null;
	}
	
	public static void main(String[] args) {
		// TODO - needs to be implemented
		
		// Creating University
		University myUniversity = new University();
		myUniversity.setmoduleDescriptors(ModuleDescriptor.getStaticData());
		myUniversity.setStudents(Student.getStaticData());
		
		// Linking Module Descriptors to University
		Module x = new Module();
		x.module = myUniversity.getmoduleDescriptors()[0];

		// Linking Students to University
		Student y = new Student();
		y.student = myUniversity.getStudents()[0];


		System.out.println(myUniversity.getmoduleDescriptors()[0].get_name());
		System.out.println(myUniversity.getNumberOfModules());


	}
}
