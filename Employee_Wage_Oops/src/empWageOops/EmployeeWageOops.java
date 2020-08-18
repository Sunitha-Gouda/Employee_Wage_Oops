package empWageOops;

//Main method
	
public class EmployeeWageOops  {
	
	public static void main(String[] args) {
			EmployeeWageImplementation empWageBuilder=new EmployeeWageImplementation();
			empWageBuilder.addCompanyEmpWage("Dmart",50,4,100);
			empWageBuilder.addCompanyEmpWage("Tech M",60,5,100);
			empWageBuilder.addCompanyEmpWage("TCS",80,3,90);
			empWageBuilder.addCompanyEmpWage("Infosys",70,4,80);
			empWageBuilder.computeEmpWage();
			System.out.println("Total wage of quired company:" +empWageBuilder.getTotalEmpWage("Infosys"));
			System.out.println();
	}

}


