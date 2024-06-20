package homeassignments1.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int input = 8;
        int num1 = 0;
        int num2 = 1;
        
        for(int i =0; i < input; i++) {
        	 
        	System.out.println(num1);
        	
        	int num3 = num1 + num2;
        	num1 = num2;
        	num2 = num3;
			
		}

	}

}

/*
0
1
1
2
3
5
8
13
*/