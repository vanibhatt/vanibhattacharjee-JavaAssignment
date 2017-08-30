package JavaAssignment_PartD;

import java.util.Date;

class Adder<num1> extends Mathematician{

//	Implementing all the abstract methods
	void subtract(int num1, int num2) {		
		
	}

	void multiply(int num1, int num2) {
		
	}

	void divide(int num1, int num2) {
		
	}

//	Adder constructor with two parameters
	Adder(int num1, int num2, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.timeRequested = new Date(timeRequested);
	}
	
//	Adder constructor with three parameters	
	Adder(int num1, int num2, int num3, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.timeRequested = new Date(timeRequested);
	}

// Add method for two numbers
	void add (int num1, int num2) {
		this.result = this.num1 + this.num2;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}

// Add method for three numbers	
	void add (int num1, int num2, int num3) {
		this.result = this.num1 + this.num2 + this.num3;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}
}
