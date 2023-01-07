/* Create a class called Employee that includes three pieces of information as
instance variables—a first name (typeString), a last name (typeString) and a
monthly salary (double). Your class should have a constructor that initializes
the three instance variables. Provide a set and a get method for each instance
variable. If the monthly salary is not positive, set it to 0.0. Write a test
application named EmployeeTest that demonstrates class Employee’s
capabilities. Create two Employee objects and display each object’s yearly
salary. Then give each Employee a 10% raise and display each Employee’s
yearly salary again. */

class Employee 
{
	private String firstName; 
	private String lastName; 
	private double monthlySalary; 
	
	
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname; 
		lastName = lname; 
		monthlySalary = msalary; 
		
		
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} 
	
	
	public void setFirstName (String fname)
	{
		firstName = fname;	
		
	} 

	
	public String getFirstName ()
	{
		return firstName;
	} 
	
	
	public void setLastName (String lname)
	{
		lastName = lname;	
	}
	
	
	public String getLastName ()
	{
		return lastName;
	} 
	

	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;	

	} 
	
	public double getMonthlySalary ()
	{
		return monthlySalary;
	}
	
	
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} 
	
	
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} 
	
}

public class EmployeeTest
{
    public static void main(String [] args)
    {
     
        Employee Rajib = new Employee("Rajib", "Kumar", 40000);
    Employee Rahul = new Employee("Rahul", "Kumar", 30000);

    System.out.println(Rajib.getFirstName() + "'s monthly salary is " + Rajib.getMonthlySalary());
    System.out.println(Rahul.getFirstName() + "'s monthly salary is " + Rahul.getMonthlySalary());

    Rajib.setMonthlySalary(Rajib.getMonthlySalary() * 1.1);
    Rahul.setMonthlySalary(Rahul.getMonthlySalary() * 1.1);

    System.out.println("Salary after 10% Increase");

    System.out.println(Rajib.getFirstName() + "'s monthly salary is " + Rajib.getMonthlySalary());
    System.out.println(Rahul.getFirstName() + "'s monthly salary is " + Rahul.getMonthlySalary());
    }
}