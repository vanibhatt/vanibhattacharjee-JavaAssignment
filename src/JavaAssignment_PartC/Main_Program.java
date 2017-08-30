package JavaAssignment_PartC;

import java.util.Scanner;

public class Main_Program {

	public static void main(String[] args) {
		
		System.out.println("Enter range of numbers");
		Scanner sc= new Scanner(System.in);	

// User enters the range of numbers		
		int start = sc.nextInt()	;		
		int end = sc.nextInt();		
		
//		close the scanner to stop from resource leak
		sc.close();		
	
//		This is to make sure that the first integer is less than the second integer otherwise gives invalid range error
		
		if (start < end ) {
			
			Number_Program t1 = new Number_Program("EVEN", start, end);
			Number_Program t2 = new Number_Program("ODD", start, end);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t2.start();
			
		} else {
			System.out.println("Invalid range of numbers");
		}
	}
}