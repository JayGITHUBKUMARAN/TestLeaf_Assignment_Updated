package day2homeassignment;

import java.util.Arrays;

public class ElementMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,4,3,2,8,6,7};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			if(num[i]!=i+1) {
				System.out.println("Missing Value:" +(i+1));
				break;
			}
		}
	}



	}


