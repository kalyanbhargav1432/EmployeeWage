package assignment1;

public class Empwage {
	public static void main(String[] args) {
		 int wage_per_hour = 20;
		  int isfulltime = 1;
		  int emphr = 0;
		  int empwage = 0;
		  double empcheck = Math.floor((Math.random() * 10) %2);
		  if(empcheck == isfulltime) {
			  System.out.println("employee is present");
			    emphr = 8;
		  }else {
			  System.out.println("employee is absent");
			    emphr = 0;
		  }
		   empwage = wage_per_hour * emphr;
		  
		   System.out.println(" employee wage is:"+ empwage); 
}
}