package JavaAssignment_PartB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Optimus {

	public static void main(String[] args) throws IOException {
		
		int x = 0, y = 0;
		
		System.out.println("Enter the string commands for optimus");
		
//		Capturing the string commands from the user
		InputStreamReader file = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(file);
        String coordinates = br.readLine();
        
//		Making sure user does not enter more than 10 commands
        
        if ( coordinates.length() > 10 ) {	
        		System.out.println("I won’t be able to make it that far");
          } else 
          {
        
	        for (int i = 0; i < coordinates.length(); i++) {
	           
	        		switch (coordinates.charAt(i)) {
				
				case 'U':   
					y = y + 1;
			        break;
				case 'R':  
					x = x + 1;
				    break;
				case 'L': 
					x = x - 1;
					break;
				case 'D': 
					y = y - 1;
					break;
//					checking commands other than 'U', 'R', 'L','D'
				default :
					System.out.println("cannot recognise commands other than 'U', 'R', 'L','D'");
	        		}
	        }
//	        Display the coordinates of Optimus based on user commands
		System.out.println(x + " " +y);		
        }
	}
}
