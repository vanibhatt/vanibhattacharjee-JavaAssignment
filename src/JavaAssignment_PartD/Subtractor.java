package JavaAssignment_PartD;

import java.util.Date;

class Subtractor extends Mathematician{

//	Implementing all abstract methods
	void add(int num1, int num2) {	
		
	}

	void multiply(int num1, int num2) {	
		
	}

	void divide(int num1, int num2) {
		
	}

//	Subtractor constructor with two parameters
	Subtractor(int num1, int num2, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.timeRequested = new Date(timeRequested);
	}

//	Subtractor constructor with three parameters
	Subtractor(int num1, int num2, int num3, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.timeRequested = new Date(timeRequested);
	}

//	Subtract method with two numbers
	void subtract(int num1, int num2) {
		this.result = this.num1 - this.num2;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}

//	Subtract method with three numbers
	void subtract(int num1, int num2, int num3) {
		this.result = this.num1 - this.num2 - this.num3;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}

}