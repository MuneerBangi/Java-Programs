public class EmployeeMonth
{
	//Constant Variable
	public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int empRatePerHour = 20;
	public static final int numOfWorkingDays= 20;
	public static final int maxHoursPerMonth = 100;
	public static void main(String[] args)
	{
		//Variables
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
		//Check Working Hour is Less Than 100 and Days less than 20
		while ( totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int empHrs = 0, empWage = 0;
			//Check Employee is Full Time or Part Time
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			{
				//Calculate Full Time Wage
				case IS_FULL_TIME:
				empHrs = 8;
				break;
				//Calculate Part Time Wage
				case IS_PART_TIME:
				empHrs = 4;
				break;

				default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Employee Wage : " +empWage);
		}
		////Display Total Salary Of Employee
		System.out.println("Total Employee Wage: " + totalEmpWage);
	}
}



