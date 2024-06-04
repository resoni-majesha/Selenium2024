package week1.day1221;

public class BizFiz {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 25; i++) {
			
			if(i % 3 == 0 && i % 7 == 0) {
				
				System.out.println(i+" bizfiz");
			} 
			else if (i % 3 == 0) {
				System.out.println(i+" biz");
			}
			else if (i % 7 == 0) {
				System.out.println(i+" fiz");
			}
			else {
				System.out.println(i+ "is not divisible by 3 or 7");
			}
			
		}
		
	}

}

/*
14 fiz
15 biz
16is not divisible by 3 or 7
17is not divisible by 3 or 7
18 biz
19is not divisible by 3 or 7
20is not divisible by 3 or 7
21 bizfiz
22is not divisible by 3 or 7
23is not divisible by 3 or 7
24 biz
*/