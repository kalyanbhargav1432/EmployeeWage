package assignment1;

public class Empwage {
	public static void main(String[] args) {
		System.out.println("welcome to employee wage");
		int isfulltime = 1;
		double empcheck = Math.floor((Math.random()*10)%2);
		if (empcheck == isfulltime)
			System.out.println("Employee is present");
		else 
			System.out.println("Employee is absent");
	}
}
