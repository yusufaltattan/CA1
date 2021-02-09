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
	public Module(int year, byte term, ModuleDescriptor module) {
		this.year = year;
		this.term = term;
		this.module = module;
	}

	// Load Data Staticly
	public static Module[] getStaticData(){
		// Create Module Descriptors
		Module ECM1400Term1 = new Module(2019, 1, );
		Module  = new Module(year, term, module);
		Module  = new Module(year, term, module);
		Module  = new Module(year, term, module);
		Module  = new Module(year, term, module);
		Module  = new Module(year, term, module);
		return new Module[]{};

	//store module descriptor 
	
	private StudentRecord[] records;
	
	private double finalAverageGrade;
	
}
