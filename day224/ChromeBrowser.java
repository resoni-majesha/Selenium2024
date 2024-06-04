package week1.day224;

public class ChromeBrowser {
	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		
		System.out.println("Application launched successfully");
		
	}

	public static void main(String[] args) {
		
		ChromeBrowser obj = new ChromeBrowser();
		
		String launchBrowser = obj.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		obj.loadUrl();

	}

}

/*
Browser launched successfully
Chrome
Application launched successfully
*/