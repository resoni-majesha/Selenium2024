package week3.day3121;

public class BsmartPhone extends BandroidPhone {

	public void connectWhatsApp() {
		
		System.out.println("Connect Whatsapp");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Bmobile m = new Bmobile(); m.sendMsg(); m.makeCall(); m.saveContact();
		 * 
		 * BandroidPhone a = new BandroidPhone(); a.takeVideo(); a.sendMsg();
		 * a.makeCall(); a.saveContact();
		 */
		
		BsmartPhone s = new BsmartPhone();
		s.connectWhatsApp();
		s.takeVideo();
		s.sendMsg();
		s.makeCall();
		s.saveContact();
		
	}
}


