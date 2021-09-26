package assignment1;

public class Empwage {
	public static void main(String[] args) {
		  int wageperhour = 20;
			 int empworkhr;
			 
			 double empcheck = Math.floor((Math.random()*10)%3);
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
			 int salary = empworkhr * wageperhour;
			 System.out.println("salary is :"+ salary);
}
}