package assignment1;

public class Empwage {
	public static void main(String[] args) {
		 int wage_per_hour = 20;
		  int full_day_hour = 8;
		  int part_time_hour = 4;
		  int isfulltime = 1;
		  int parttime = 2;
		  double empcheck = Math.floor((Math.random() * 10) %3);
		  if(empcheck == isfulltime) {
			  int salary = full_day_hour * wage_per_hour;
			  System.out.println("daily employee wage for full  time:"+salary); 
		  }
		  
		  else if (empcheck == parttime) {
			  int salary1 = part_time_hour * wage_per_hour;
			  System.out.println("daily employee wage for part time:"+salary1);
		  }
		  else {
			  System.out.println("employee is absent");
		  }

}
}