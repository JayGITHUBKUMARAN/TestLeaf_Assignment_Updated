package day1homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X=0,Y=1,Z;
		int range=8;
		System.out.println("First "+range+" fibonacci series value");
		System.out.print(X+" "+Y);
;
		for (int i = 0; i < range-2; i++) {
			Z=X+Y;
			X=Y;
			Y=Z;
			System.out.print(" "+Z);
			
		}
		

		}

	
	
	}


