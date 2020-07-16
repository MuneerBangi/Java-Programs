/**
*The Employee class
*/
public class EmployeeWage
{
	//Constant Variables
	public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME=2;
   public static final int empRatePerHrs=20;
   public static final int numOfWorkingDays=20;
   public static final int maxHoursPerMonth=100;

	public static int computeEmpWage()
	{
	   int empHrs= 0, totalEmpHrs=0, totalWorkingDays=0;
		System.out.println("Welcome to Employee Wage calculation");
		//Check Working Day is not beyond 20
		//Check Working Hour is Less Than 100
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
		{
			totalWorkingDays++;
         final int check = (int) Math.floor(Math.random() * 10) % 3;
         switch(check)
			{
         	case 1:
            empHrs=4;
            break;

				case 2:
            empHrs=8;
            break;

				case 3:
            empHrs=0;
            break;
         }
         totalEmpHrs+=empHrs;
         System.out.println("Day#:"+ totalWorkingDays +"Emp Hrs: "+ empHrs);
      }
   	int totalEmpWage = totalEmpHrs * empRatePerHrs;
   	System.out.println("Total Emp wage ; "+ totalEmpWage);
   	return totalEmpWage;
	}
	public static void main(String [] args)
	{
		computeEmpWage();
	}
}

