package JavaAssignment_PartC;

import java.util.ArrayList;
import java.util.List;

public class Number_Program extends Thread {
	
	String numberType = " ";
	int start = 0;
	int end = 0;
	List<Integer> numberList = new ArrayList<Integer>();	
	
	public Number_Program(String numberType, int start, int end) {
		this.numberType = numberType;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
	
//		Generating even numbers between the range of numbers entered by user
		if ( this.numberType == "EVEN") {
			System.out.println("Even numbers in given range");
			for (int i = start; i <= end; i++) {
				if (i%2 == 0) {
			     	this.numberList.add(i);		     	
				}				
			}
			
		}
		
//		Generating odd numbers between the range of numbers entered by user	
		if ( this.numberType == "ODD") {
			System.out.println("Odd numbers in given range");
			for (int i = start; i <= end; i++) {
				if (i%2 != 0) {
				this.numberList.add(i);		
				}	
			}	
		}
		
//		Display the output for both types
		System.out.println(this.numberList);	
		}
	}		

