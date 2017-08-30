package JavaAssignment_PartD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class InputCollector {

	private long timeRequested;
	private int num1, num2, num3, moreoption;
	
	InputCollector () {
	    timeRequested =  Calendar.getInstance().getTimeInMillis();
	}
	
	public void collectinput () throws IOException {
		
		System.out.println("What function do you want to perform ?");
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
	
//		User enters the function they want to perform
		Scanner sc = new Scanner(System.in);
		int inputfunction = sc.nextInt();
	
//		Making sure user do not enter values other than 1, 2 , 3 or 4 
		if ((inputfunction != 1) && (inputfunction != 2) && (inputfunction != 3) && (inputfunction != 4)) {	
			System.out.println("Not valid input");
		} else {
//		proceed with valid functions and prompting user to enter first two integers
			System.out.println("Enter the two integers : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println("Do you have third integer ?");
			System.out.println("Enter '1' for Yes");
			System.out.println("Enter '2' for No");
			
//		 Accepting third integer based on user choice	
			moreoption = sc.nextInt();
			
			if (moreoption == 1) {
				System.out.println("Enter the third integer");
				num3 = sc.nextInt();
			} else if (moreoption ==2) {
				System.out.println("No more integers");
			}	
		}
		
// 	closing the scanner input to prevent resource leak
		sc.close();		
		
//		defining the output file for over the top calculator
		File log = new File("Mathematician's Log Book");
		FileWriter outputStream = new FileWriter(log, true);
		
		try {
			
				switch (inputfunction) {
// adder with 2 or 3 parameters based on user input	
					case 1:
						if (moreoption == 1) {
							Adder<Integer> a1 = new Adder<Integer>(num1, num2, num3, timeRequested);
							a1.add(num1, num2, num3);
						} else if (moreoption ==2) {
							Adder<Integer> a1 = new Adder<Integer>(num1, num2, timeRequested);
							a1.add(num1, num2);	
						}			
//				writing the log book
						outputStream.write(Calendar.getInstance().getTime().toString());	
						break;
			
					case 2 : 
// subtractor with 2 or 3 parameters based on user input					
						if (moreoption == 1) {
							Subtractor s1 = new Subtractor(num1, num2, num3, timeRequested);
							s1.subtract(num1, num2, num3);
						} else if (moreoption ==2) {
							Subtractor s1 = new Subtractor(num1, num2, timeRequested);
							s1.subtract(num1, num2);	
						}
//				writing the log book
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
			
					case 3: 
// multiplier with 2 or 3 parameters based on user input						
						if (moreoption == 1) {
							Multiplier m1 = new Multiplier(num1, num2, num3, timeRequested);
							m1.multiply(num1, num2, num3);
						} else if (moreoption ==2) {
							Multiplier m1 = new Multiplier(num1, num2, timeRequested);
							m1.multiply(num1, num2);			
						}	
//					writing the log book
						outputStream.write(Calendar.getInstance().getTime().toString());
						break;
			
					case 4 :
// divider with 2 or 3 parameters based on user input						
						if (moreoption == 1) {
							Divider d1 = new Divider(num1, num2, num3, timeRequested);
							d1.divide(num1, num2, num3);
						} else if (moreoption ==2) {
							Divider d1 = new Divider(num1, num2, timeRequested);
							d1.divide(num1, num2);		
						}
//					writing the log book
					outputStream.write(Calendar.getInstance().getTime().toString());
					break;
					
					default :
							break;
				}	
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
			outputStream.close();
		}
//		garbage collector method
		System.gc();
	}
}

