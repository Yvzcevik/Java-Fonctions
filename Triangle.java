// We'll give 3 number. Program tells us if they can generate a triangle

import java.util.Scanner;

	public class triangle {
		
		
		public static void main ( String args[]){
			
			
			
			Scanner data1=new Scanner (System.in);
			
			System.out.println("Please Enter First Edge of Triangle: ");
			
			int edge1=data1.nextInt();
			
            Scanner data2=new Scanner (System.in);
		 	
			System.out.println("Please Enter Second Edge of Triangle: ");
			
			int edge2=data2.nextInt();
			
			Scanner data3=new Scanner (System.in);
			
			System.out.println("Please Enter Third Edge of Triangle: ");
			
			int edge3=data3.nextInt();
	
	if( edge1-edge2<edge3 && edge1-edge2>0 && edge1+edge2>edge3){
		
		System.out.println("The edges given by user, can generate a triangle");
		
		
	}
	
	else 
		
		System.out.println("The edges given by user, can not generate a triangle");
	
		}

}
