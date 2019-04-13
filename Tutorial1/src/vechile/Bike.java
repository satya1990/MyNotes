package vechile;

public class Bike {

	private
		int engine_cc;
		String manufacturer;
	public Bike(String brand, int cc){
		engine_cc = cc;
		manufacturer = brand;
	}
	
	public void getINfo(){
		System.out.println(" Manufacturer: "+manufacturer+" engine_cc: "+engine_cc);
	}
	
}
