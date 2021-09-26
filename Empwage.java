package assignment1;

public class Empwage {
	public static void main(String[] args) {
		int workingdays = 20;
		int wage_per_hour = 20;
		int totalsalary = 0;
		 int empworkhr;
		 int salary = 0;
		 int day =0; 
		for(day = 1;day <= workingdays;day++) {
			double empcheck = Math.floor((Math.random() * 10) %3);
			int i = (int)empcheck;
			switch(i) {
			case 1:
				  empworkhr = 8;
				  break;
			  case 2:
				  empworkhr = 4;
				  break;
			 default:
				 empworkhr = 0;	 
			}
			salary = empworkhr *  wage_per_hour;	
			 System.out.println(" salary for day "+ day + " :"+ salary); 
			 totalsalary = totalsalary + salary;
			 System.out.println("total salary is :"+ totalsalary);	 
		}			 
}
}