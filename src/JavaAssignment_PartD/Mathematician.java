package JavaAssignment_PartD;

import java.util.Date;

public abstract class Mathematician {
	
	protected int num1, num2, num3, result, responseTime;
	Date timeRequested;

//	abstract methods of the Mathematician abstract class
	abstract void add(int num1, int num2);
	abstract void subtract(int num1, int num2);
	abstract void multiply(int num1, int num2);
	abstract void divide(int num1, int num2);
	
	void print(int result, int responseTime) {
		System.out.println("The answer to your inquiry is " +result);
		System.out.println("Response time: " +responseTime);
	}
	
}
