
class Student extends Person
{
	private int rollNo;
	private String name;
	private int m1,m2,m3;
	public Student(){}
	public Student(int ssn,String name,int age,Address address,int rollNo,int m1,int m2,int m3)
	{
	super(ssn,name,age,address);
	this.rollNo = rollNo;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	}


	public void setRollNo(int rollNo) { this.rollNo = rollNo;}
	public void setM1(int m1){this.m1=m1;}
	public void setM2(int m2){this.m2=m2;}
	public void setM3(int m3){this.m3=m3;}

	public int getRollNo() { return rollNo;}
	public int getM1(){return m1;}
	public int getM2(){return m2;}
	public int getM3(){return m3;}

	public int getTotal()
	{
		return m1+m2+m3;
	}
	public int getAverage()
	{
		return (m1+m2+m3)/3;
	}
	public String getResults()
	{
		return (m1>=40 && m2>=40 && m3>=40) ? "Pass" : "Fail";
	}
	
	public void showStudentDetails()
	{
		showPersonDetails();
		System.out.println("Mark 1 : "+getM1());
		System.out.println("Mark 2 : "+getM2());
		System.out.println("Mark 2 : "+getM3());
		System.out.println("Total Marks : "+getTotal());
		System.out.println("Result  : "+getResults());
	}
				
}
 

/*class Student extends Person
{
	private int empid;
	private double salary;
	private int rollNo;
	private String name;
	private int m1,m2,m3;	
	public Student() {}
	public Student(int ssn, String name, int age, Address address, int empid, double salary){
		super(ssn, name, age, address);
		this.empid = empid;	this.salary = salary;
	}
	public void setEmpId(int empid){  this.empid = empid;  }
	public void setSalary(double salary){  this.salary = salary;  }

	public int getEmpid(){ return empid; }
	public double getSalary() { return salary; }

	

	public void showEmployeeDetails()
	{
		showPersonDetails();
		System.out.println("Empid: "+getEmpid());
		System.out.println("Salary: "+getSalary());
	}
	
	
}
*/





