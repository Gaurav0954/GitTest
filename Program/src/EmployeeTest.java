class Employee{
	String FisrtName;
	String LastName;
	Double mSalary;

	Employee(){
		FisrtName="Dheeraj";
		LastName="Maut";
		mSalary=2.5;
	}

	Employee(String FisrtName,String LastName, Double mSalary){
		this.FisrtName=FisrtName;
		this.LastName=LastName;
		this.mSalary=mSalary;
	}

	double AnnualS(){
		return 12*mSalary;
	}

}
class Employeetest{
	public static void main(String[] args){
		Employee Dheeraj=new Employee();
		Employee Nehra=new Employee("Nehra","shinigami",2.0);
		double a,b;
		a=Dheeraj.AnnualS();
		b=Nehra.AnnualS();
		System.out.println("Annual Salary of "+Dheeraj.FisrtName+" ("+Dheeraj.LastName+") is "+a);
		System.out.println("Annual Salary of "+Nehra.FisrtName+" ("+Nehra.LastName+") is "+b);

	}
}