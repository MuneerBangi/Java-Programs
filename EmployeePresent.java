/**
*Employee class Check
*/
public class EmployeePresent
{
	public static void main(String[] args)
	{
		int IS_PRESENT=1;
		//Check Employee Full Time or Part Time
		double check=Math.floor(Math.random()*10)%2;
		if (check==IS_PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
