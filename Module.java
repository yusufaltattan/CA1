public class Module {
	
	// Properties
	private int year;
	private byte term;
	private ModuleDescriptor module;
	private StudentRecord[] records;
	private double finalAverageGrade;
	

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
	public StudentRecord[] getRecords() {
		return this.records;
	}
	public double finalAverageGrade(){
		double totalGrade = 0;
		for(int i = 0; i<this.records.length; i++){
			totalGrade = totalGrade + this.records[i].getFinalScore;
		}
		double average = totalGrade / this.records.length;
		return average;
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
	public void setRecords(StudentRecord[] records) {
		this.records = records;
	}
	public void setFinalAverageGrade(double finalAverageGrade) {
		this.finalAverageGrade = finalAverageGrade;
	}

	// Constructors
	public Module(int year, byte term, ModuleDescriptor module, StudentRecord[] records, double finalAverageGrade) {
		this.year = year;
		this.term = term;
		this.module = module;
		this.records = records;
		this.finalAverageGrade = finalAverageGrade;
	}
	

	// Load Data Staticly
	public static Module[] getStaticData(){
		// Create Module Descriptors 
		Module PRGtermOne2019 = new Module(2019, 1, ModuleDescriptor PRG, records, finalAverageGrade);
		Module PRGtermTwo2019 = new Module(2019, 2, ModuleDescriptor PRG, records, finalAverageGrade);
		Module TPtermOne2019 = new Module(2019, 1, ModuleDescriptor TP, records, finalAverageGrade);
		Module IStermOne2019 = new Module(2019, 2, ModuleDescriptor IS, records, finalAverageGrade);
		Module DStermOne2020 = new Module(2020, 1, ModuleDescriptor DS, records, finalAverageGrade);
		Module OOPtermOne2020 = new Module(2020, 1, ModuleDescriptor OOP, records, finalAverageGrade);
		Module RWMtermTwo2020 = new Module(2020, 2, ModuleDescriptor RWM, records, finalAverageGrade);
		return new Module[]{PRGtermOne2019, PRGtermTwo2019, TPtermOne2019, IStermOne2019, DStermOne2020, OOPtermOne2020, RWMtermTwo2020};

	//store module descriptor 
}
