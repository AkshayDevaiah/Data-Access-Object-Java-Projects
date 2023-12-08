package Lights;


public class LightFactory {
	public static LightInterface getLight(String l) {
		if(l.equalsIgnoreCase("led")) {
			return new LedLight();
		}
		else if(l.equalsIgnoreCase("tubelight")) {
			return new TubeLight();
		}
		else {
			System.out.print("not found");
			return null;
		}
		
	}
}
