package InheritancePracticeTwo;

public class User {
	public static void main(String[] args) {
		Guest gu = new Guest();
		gu.read();
		
		
		Developer de = new Developer();
		de.read();
		de.write();
		
		
		Admin ad = new Admin();
		ad.read();
		ad.write();
		ad.manage();
	}

}
