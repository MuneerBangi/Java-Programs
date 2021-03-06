import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeFinal implements IComputeEmpWage
{
	//static variable
   private static final int IS_FULL_TIME=1;
   private static final int IS_PART_TIME=2;
   //instance variable
   private int noOfCompany;
   private List<Company> companyList;
   private Map<String,Company> map;
   //constructor
   public void EmployeeFinal()
	{
      this.companyList = new ArrayList<>();
      this.map = new HashMap<>();
    }

   @Override
   public void addCompany(final String name, final int empRatePerHrs, final int numOfWorkingDays, final int maxHrsInMonth)
	{
   	final Company company = new Company(name, empRatePerHrs, numOfWorkingDays, maxHrsInMonth);
      companyList.add(company);
      map.put(name, company);
   }
   public void computeEmpWage()
	{
      for(int i = 0; i < companyList.size(); i++)
		{
         this.computeEmpWage(companyList.get(i));
         System.out.println(companyList.get(i));
      }
   }
   private void computeEmpWage(final Company company)
	{
   	//variables
   	int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
   	//Computation
   	while(totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getNumOfWorkingDays())
		{
      	totalWorkingDays++;
      	int check = (int)Math.floor(Math.random() * 10) % 3;
      	switch(check)
			{
         	case IS_FULL_TIME:
				empHrs=8;
				break;

				case IS_PART_TIME:
				empHrs=4;
				break;

				default:
				empHrs=0;
				break;
         }
	      totalEmpHrs+=empHrs;
	   	System.out.println("Day: "+ totalWorkingDays+ "Emp Hrs: "+ empHrs);
      }
      final int wage = totalEmpHrs * company.getEmpRatePerHrs();
      company.setTotalEmpWage(wage);
   }

   @Override
   public int getTotalWage(String name)
   {
	final Company company= map.get(name);
	return company.getTotalEmpWage();
   }

	public static void main(String[] args)
	{
   	IComputeEmpWage cw=new EmployeeFinal();
   	cw.addCompany("Apple", 20, 20, 100);
   	cw.addCompany("Sony", 22, 30, 120);
   	cw.computeEmpWage();
   	final int appleWage=cw.getTotalWage("Apple");
   	System.out.println("Total Emp Wage for Apple is:"+appleWage);
   	final int sonyWage=cw.getTotalWage("Sony");
   	System.out.println("Total Emp Wage for Sony is:"+sonyWage);
	}
}

 interface IComputeEmpWage
{
	 public void addCompany(final String name, final int empRatePerHrs, final int numOfWorkingDays, final int maxHrsInMonth);
	 public void computeEmpWage();
	 public int getTotalWage(String name);
}

/** Created a class named Company
* default and parameterized construct is formed
* we have used getter and setter method to privately access the variables
* @override instance method toString() is created
*/
class Company
{
   private String name;
   private int empRatePerHrs;
   private int numOfWorkingDays;
   private int maxHrsInMonth;
   private int totalEmpWage;
   //default constructor
   public Company()
	{
   }
   //parameterized constructor
   public Company(final String name, final int empRatePerHrs, final int numOfWorkingDays, final int maxHrsInMonth)
	{
   	this.name=name;
      this.empRatePerHrs=empRatePerHrs;
      this.numOfWorkingDays=numOfWorkingDays;
      this.maxHrsInMonth=maxHrsInMonth;
   }

   // @return values using get and set method
   public void setName(final String name)
	{
      this.name = name;
   }
   public String getName()
	{
      return name;
   }
   public void setEmpRatePerHrs(final int empRatePerHrs)
	{
      this.empRatePerHrs = empRatePerHrs;
   }
   public int getEmpRatePerHrs()
	{
      return empRatePerHrs;
   }
   public void setNumOfWorkingDays(final int numOfWorkingDays)
	{
      this.numOfWorkingDays = numOfWorkingDays;
   }
   public int getNumOfWorkingDays()
	{
      return numOfWorkingDays;
   }
   public void setMaxHrsInMonth(final int maxHrsInMonth)
	{
      this.maxHrsInMonth = maxHrsInMonth;
   }
   public int getMaxHrsInMonth()
	{
      return maxHrsInMonth;
   }
   public void setTotalEmpWage(final int totalEmpWage)
	{
      this.totalEmpWage = totalEmpWage;
   }
   public int getTotalEmpWage()
	{
      return totalEmpWage;
   }
   // @override
   public String toString()
   {
     return "Total Emp wage for Company "+ name +" is: "+ totalEmpWage;
	}
}
