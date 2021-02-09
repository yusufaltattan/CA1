public class Module {
	
	// Properties
	private int year;
	private byte term;
	private ModuleDescriptor module;

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
	public module(int year, byte term, ModuleDescriptor module) {
		this.year = year;
		this.term = term;
		this.module = module;
	}

	//store module descriptor 
	
	private StudentRecord[] records;
	
	private double finalAverageGrade;
	
}
