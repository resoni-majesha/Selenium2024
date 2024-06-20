package homeassignments1.week1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
	     int num = 16;
	     
	     int count = 0;
	     
	     for (int i = 1; i <= 13; i++) {
	    	 
	    	 if(num%i == 0) {
	    		 
	    		 count++;
	    		 
	    	 }
	    	 
	     }
			
	    	 if(count == 2) {
	    		 
	    		 System.out.println(+num + " is prime");
	    	 }else {
	    		 
	    		 System.out.println(+num + " is not prime");
	    	 }
		}
		
		

	}



