/**
*EMPLOYEE Class
*/
public class EmployeeMethod
{
	//Constant Variables
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static double present;
	public static int salaryPerDay;
	public static int totalWorkingHours=0;
	public static int workHours=8;
	public static int partTimeWorkHours=4;
	public static int totalWage=0;

	public static void main(String[] args)
	{
		//Calling Function
		empCheck();
		System.out.println("Total Employee is: "+totalWage);
	}

	/**
	*Check Employee Function
	@return  total Wage of Employee
	*/
	public static void empCheck()
	{
	for(int day=1;day<20;day++)
		{
			while(totalWorkingHours<100)
			{
				int check=(int)Math.floor(Math.random()*10)%3;
				switch(check)
				{
				case IS_FULL_TIME:
				//Calling Function calculateWage
				salaryPerDay =calculateWage(20, 8);
				System.out.println("Employee Wage: " + salaryPerDay);
				totalWorkingHours+=workHours;
				break;

				case IS_PART_TIME:
				//Calling Function calculateWage
				salaryPerDay = calculateWage(20, 4);
				System.out.println("Employee Wage: " + salaryPerDay);
				totalWorkingHours+=partTimeWorkHours;
				break;

				default:
				System.out.println("Employee is absent");
				salaryPerDay=0;
				totalWorkingHours+=0;
				break;
				}
			totalWage+=salaryPerDay;
			}
		}
	}

   /**
   *Calculate Employee Salary based on params
	*@param EMP_RATE_PER_HOUR
	*@param workHours
  *return  total Wage of Employee
   */
	public static int calculateWage(final int EMP_RATE_PER_HOUR, final int workHours)
	{
		return EMP_RATE_PER_HOUR*workHours;
	}

}

