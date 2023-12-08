package PhoneInfo;

public class phoneFactory {
	public static phoneInterface getPhone(String p) {
		if(p.equalsIgnoreCase("Iphone")) {
			return new iphoneImplementation();
		}
		else if(p.equalsIgnoreCase("Samsung")) {
			return new SamsungImp();
		}
		else {
			System.out.print("not found");
			return null;
		}
		
	}
}
