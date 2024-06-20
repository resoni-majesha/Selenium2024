package homeassignments1.week1;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		
		int temp = 0;
		
		for (int i = num; i > 0; ) {
			
			int rem =i%10;
			
			temp = temp*10 + rem;
			
			i = i/10;
			
		}

		if(num == temp) {
			
			System.out.println(temp +" is palindrome");
		}else {
			
			System.out.println(temp +" is not palindrome");
		}
			
		
	}

}
