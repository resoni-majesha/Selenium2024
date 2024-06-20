package week1.day1224;

public class LearnLoops {
	
	public static void main(String[] args) {
	
	int num = 10;
	
    // for ctrl = space and choose the second option
	
	for (int i = 1; i < num; i++) {
		System.out.println(i);
	}
	
	System.out.println(" ");
	
	// To print the for loop in reverse
	// i = i-1
	for (int i = 9; i > 0; i--) {
		
		System.out.println(i);
		
	}
	
	System.out.println(" ");
	
	// break - will stop the execution
	
	for (int i = 1; i < num; i++) {
		
		
		// if(i ==4)
		if(i==4) {
			break;
		}
		
		System.out.println(i);
		
	}
	
	System.out.println(" ");
	
	// continue - to skip 5 number
	
for (int i = 9; i > 0; i--) {
	
	    if(i == 5) { // To skip multiple number, use || (or operator) i.e if(i == 5 || i == 6 || i == 7), 5,6,7 skipped
	    	
	    	continue;
	    }
		
		System.out.println(i);
		
	}

}
}
 
/*

1
2
3
4
5
6
7
8
9
 
9
8
7
6
5
4
3
2
1
 
1
2
3
 
9
8
7
6
4
3
2
1

*/


/*int power i = 1;
 * for(int i = 0;  i<= n; i++)
 * {
 *   System.out.println(i+ " " + power);
 *   power = 2 * power;
 * }
 * 
 * initialization, condition, increment / decrement
 * It will check initialization, condition, execute body part, then increment
 * Again will check the for loop, until the condition become false
 * In for loop, we mostly use int data type
 * 
 * 
 * To check the debug mode, how the code is working, double click the line for which yu need to check the
 * process, right click, debug as >> Java Application, click on play and pause button
 * 
 * Jump Statements - Break & Continue
 * break - once it reach the value given in if condition, program will stop
 * continue - value given in the condition will be skipped
 * 
 * selection - if, else if, iteration - for, jump - break, continue
 * 
 */