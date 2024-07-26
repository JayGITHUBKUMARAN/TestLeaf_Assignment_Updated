package day1homeassignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		//Prime number to be Printed
		//Any value divided by 1 or itself is prime number
		
		int num=63;
		
		for(int i=2; i<num; i=i+1) {
			if (num % i ==0) {
				System.out.println(num+ " Not a Prime number");
				return;
				
			}
		}
	System.out.println(num+ " is a Prime number");
		
			 
		
	
	}



}


	
	


		
				

	


