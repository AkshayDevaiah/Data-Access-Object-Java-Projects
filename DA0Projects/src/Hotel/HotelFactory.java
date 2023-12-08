package Hotel;

public class HotelFactory {
	public static HotelInterface createInstance() {
		return new HotelImplementation();
	}
}
