package week1.day1121;

public class Mobile {

	String Brand = "Apple";
	String model = "iPhone13";
	short memory = 64;
	boolean is100PixelCamera = true;
	float price = 50000.99f;
	char icon = 'R';
	
	public int getPrice(int mobileValue) {
		
		if(mobileValue == 1) {
		    return 10000;
		} else if (mobileValue == 2) {
			return 20000;
		} else if (mobileValue == 3) {
			return 30000;
		} else {
			return 40000;
		}
		}
		
	public String getModel() {
		return "iPhone12";
	}
	
	private void printPicture() {
		System.out.println("It's my son");
	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		System.out.println(myMobile.getPrice(2));
		System.out.println(myMobile.getModel());
	}
	
}

/*
20000
iPhone12
*/
