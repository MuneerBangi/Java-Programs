/**
*Employee Check
*/
public class EmployeeDaily
{
	public static void main(String[] args)
	{
		int IS_PRESENT=1;
		int  empRatePerHr=20;
      int empHrs=8;
		int salary;
      //Check Employee Full Time or Part Time
		double check=Math.floor(Math.random()*10)%2;
		if (check==IS_PRESENT)
		{
			System.out.println("Employee is Present");
			salary=empHrs*empRatePerHr;
			System.out.println("Salary="+salary);
		}
		else
		{
			System.out.println("Employee is Absent");
			System.out.println("Salary=0");
		}
		}
}
