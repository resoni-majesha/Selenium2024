package week1.day221;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int input = 123;
		
		int sum = 0;
		
		int orgNum = input;
		
		while (input > 0) {
			
			int rem = input % 10;
			
			sum = sum + (rem * rem * rem);
			
			input = input / 10;
		}
		
		if (sum == orgNum) {
			
			System.out.println("Given Number is Armstrong number");
		} else
			
		{
			System.out.println("Given number is not an Armstrong number");
		}
			
	}

}

/*
 Given number is not an Armstrong number
*/
