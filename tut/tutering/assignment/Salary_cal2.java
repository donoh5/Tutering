package assignment;

import java.util.Scanner;

public class Salary_cal2 {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		System.out.print("Enter your annual salary: ");
		float salary = my_inp.nextFloat();
		
		System.out.print("Enter average hours worked per week: ");
		int hours = my_inp.nextInt();
		
		System.out.println("Alberta : '1', B.C : '2', Ontario : '3'");
		System.out.print("Press the number of your province: ");
		int prov = my_inp.nextInt();
		
		float tax = 0;
		
		switch (prov)
		{
		case 1:
			if (salary <= 131220)
				tax += 10;
			else if (salary <= 157464)
				tax += 12;
			else if (salary <= 209952)
				tax += 13;
			else if (salary <= 314928)
				tax += 14;
			else
				tax += 15;
			break;
		case 2:
			if (salary <= 42184)
				tax += 5.06;
			else if (salary <= 84369)
				tax += 7.7;
			else if (salary <= 96866)
				tax += 10.5;
			else if (salary <= 117623)
				tax += 12.29;
			else if (salary <= 159483)
				tax += 14.7;
			else if (salary <= 222420)
				tax += 16.8;
			else
				tax += 20.5;
			break;
		case 3:
			if (salary <= 45142)
				tax += 5.05;
			else if (salary <= 90287)
				tax += 9.15;
			else if (salary <= 150000)
				tax += 11.16;
			else if (salary <= 220000)
				tax += 12.16;
			else
				tax += 13.16;
			break;
		default:
			System.out.println("");
			System.out.println("Please enter proper number.");
		    System.exit(0);
		}
		
		if (salary <= 49020)
			tax += 15;
		else if (salary <= 98040)
			tax += 20.5;
		else if (salary <= 151978)
			tax += 26;
		else if (salary <= 216511)
			tax += 29;
		else
			tax += 33;
		
		salary = salary * (100-tax) / 100;
		
		int ex_msal = (int)(salary / 12 * 100);
		float m_sal = (float)ex_msal / 100;
		
		int ex_wsal = (int)(salary / 52 * 100);
		float w_sal = (float)ex_wsal / 100;

		int ex_hsal = (int)(w_sal / hours * 100);
		float h_sal = (float)ex_hsal / 100;
				
		System.out.println("");
		System.out.println("Tax : " + tax + " %");
		System.out.println("Annual Salary : $" + (float)(int)(salary*10) / 10);		
		System.out.println("Monthly Salary : $" + m_sal);
		System.out.println("Biweekly Salary : $" + 2 * w_sal);
		System.out.print("Hourly wage : $" + h_sal);
		
		my_inp.close();
		
	}

}