package homeassignments1.week1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int num[] = {1,4,3,2,8,6,7};
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			
			     int j = i+1;
			     
			     if(j != num[i]) {
			    	 
			    	 System.out.println(j);
			    	 
			    	 break;
			     }
			
			}
			
		}
			
	}




