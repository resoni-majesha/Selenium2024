package week1.day221;

public class LearnControlStatements {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
			
				System.out.println("Three");
				
				continue; 
		}
        System.out.println(i);
	}

  }
}

/*
1
2
Three
4
5
*/