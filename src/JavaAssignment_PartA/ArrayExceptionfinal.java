package JavaAssignment_PartA;

import java.util.Scanner;

public class ArrayExceptionfinal {

	public static void main(String[] args) {
		
		System.out.println("Enter the number elements in the array ");
		Scanner sc= new Scanner(System.in);
//		populating the size of the array as entered by user
		int i = sc.nextInt();
		
		System.out.println("Enter elements of the array ");
	
//		populating elements of the array as entered by user
		int[] myArray = new int[i];
		for (int j = 0; j < myArray.length; j++) 
		{
			myArray[j] = sc.nextInt()	;		
		}		
		
		System.out.println("Enter the index of the array element you want to access : ");		
		
		int x = sc.nextInt();
	
//		Getting the values of the array based on the index no entered by user
		try { 
				System.out.println("The array element at index " +x +" = " + myArray[x]);
				System.out.println("The array element successfully accessed ");
		    } 
		catch 	(ArrayIndexOutOfBoundsException e){	
				System.out.println("IndexOutOfRangeException");	
		    }
		finally {
				sc.close();
	        }	
     }
}
