/**
*Employee Check class
*/
public class EmployeeSwitch
{
	public static void main(String[] args)
	{
		//constant variable
 		final int IS_FULL_TIME=1;
    	final int IS_PART_TIME=2;
      int empRatePerHr=20;
      int empHrs=0;
      int salary;
	 	//Check Employee is Full Time or Part Time
		int check=(int)Math.floor(Math.random()*10)%3;
		switch (check)
		{
			//Calculate Full Time Wage
			case IS_FULL_TIME:
			empHrs = 8;
			salary=empHrs*empRatePerHr;
		   System.out.println("Salary="+salary);
			break;
			//Calculate Part Time Wage
			case IS_PART_TIME:
			empHrs = 4;
			salary=empHrs*empRatePerHr;
         System.out.println("Salary="+salary);
			break;

			default:
			empHrs = 0;
			salary=empHrs*empRatePerHr;
         System.out.println("Salary="+salary);
		}
	}
}
