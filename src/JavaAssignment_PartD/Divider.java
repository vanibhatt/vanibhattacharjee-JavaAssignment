package JavaAssignment_PartD;

import java.util.Date;

class Divider extends Mathematician{

//	Implementing all the abstract methods
	void add(int num1, int num2) {	
		
	}
	
	void subtract(int num1, int num2) {	
		
	}

	void multiply(int num1, int num2) {	
		
	}

//	Divider constructor with two parameters
	Divider(int num1, int num2, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.timeRequested = new Date(timeRequested);
	}

//	Divider constructor with three parameters
	Divider(int num1, int num2, int num3, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.timeRequested = new Date(timeRequested);
	}

//	Divide method with two numbers	
	void divide (int num1, int num2) {
		this.result = this.num1/this.num2;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result,this.responseTime);		
	}
	
//	Divide method with three numbers		
	void divide (int num1, int num2, int num3) {
		this.result = this.num1/this.num2/this.num3;
		Date timeNow =  new Date();
		this.responseTime = timeNow.getSeconds() - timeRequested.getSeconds();	
		print(this.result, this.responseTime);		
	}

}