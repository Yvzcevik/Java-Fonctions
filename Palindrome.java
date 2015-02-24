

public class palindrome{

	
	
	// We're finding 4-digit palindromic numbers
	
	
	
	public static void main(String args[]) {

		
		
		
		
		for (int i = 1000; i < 10000; i++) {

			
			
			
			
			if ((i - (i % 1000))/1000 == i%10 && ((i % 100) - (i % 10))/10 == ((i % 1000) - ((i % 100)))/100){
				
			
					
				

				System.out.println(i+" ");
				
				
				
			}

		}
	}

}
