package assignment1;

public class Empwage {
	public static void main(String[] args) {
		int totalsalary = 0;
		int empworkhour = 20;
		int workingdays = 20;
		int totalworkingdays = 0;
		int max_hr_per_month = 100;
		int emphr = 0;
		int totalempworkhr = 0;
		while(totalempworkhr <= max_hr_per_month && totalworkingdays < workingdays) {
			totalworkingdays++;
			double empcheck = Math.floor((Math.random() * 10) %3);
			int i = (int)empcheck;
			switch(i) {
			case 1 :
				emphr = 8;
				break;
			case 2 :
				emphr = 4;
				break;
			default :
				emphr = 0;	
			}
			totalempworkhr = totalempworkhr + emphr;
			System.out.println("total employee working hour is :"+totalempworkhr);
			System.out.println("total working days:"+ totalworkingdays);
		}
		 	totalsalary = empworkhour * totalempworkhr;
		 	System.out.println("total salary is:"+totalsalary);
		}			 
}
