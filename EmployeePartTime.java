/**
*Employee Check class
*/
public class EmployeePartTime
{
	public static void main(String[] args)
	{
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int empRatePerHr=20;
      int empHrs=0;
		int salary;
	   //Check Employee Full Time or Part Time
		double check=Math.floor(Math.random()*10)%2;
		if (check==IS_FULL_TIME)
		{
			 empHrs=8;
			salary=empHrs*empRatePerHr;
			System.out.println("Salary="+salary);
		}
		else
		{
			 empHrs=4;
			 salary=empHrs*empRatePerHr;
			System.out.println("Salary="+salary);
		}
	}
}
