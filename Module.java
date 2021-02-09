public class Module {
	
	// Properties
	private int year;
	private byte term;
	public ModuleDescriptor module;

	// Get Functions
	public int getYear() {
		return this.year;
	}
	public byte getTerm() {
		return this.term;
	}
	public ModuleDescriptor getModule() {
		return this.module;
	}

	// Set Functions
	public void setYear(int year) {
		this.year = year;
	}
	public void setTerm(byte term) {
		this.term = term;
	}
	public void setModuleDescriptor(ModuleDescriptor module) {
		this.module = module;
	}

	// Constructors


	//store module descriptor 
	
	private StudentRecord[] records;
	
	private double finalAverageGrade;
	
}
