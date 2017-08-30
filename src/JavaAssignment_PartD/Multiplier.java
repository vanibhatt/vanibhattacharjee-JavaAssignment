package JavaAssignment_PartD;

import java.util.Date;

class Multiplier extends Mathematician{

//	Implementing all abstract methods
	void add(int num1, int num2) {
			
	}

	void subtract(int num1, int num2) {	
		
	}

	void divide(int num1, int num2) {
		
	}
	
//	Multiplier constructor with two parameters
	Multiplier(int num1, int num2, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.timeRequested = new Date(timeRequested);
	}

//	Multiplier constructor with three parameters
	Multiplier (int num1, int num2, int num3, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.timeRequested = new Date(timeRequested);
	}

//	Multiply method for two numbers
	void multiply (int num1, int num2) {
		this.result = this.num1 * this.num2;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}

//	Multiply method for three numbers
	void multiply(int num1, int num2, int num3) {
		this.result = this.num1 * this.num2 * this.num3;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}


}