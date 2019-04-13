package vechile;

public class Car {

	private
	int engine_cc;
	String manufacturer;
public 
	Car(String brand, int cc){
	engine_cc = cc;
	manufacturer = brand;
}

public void getINfo(){
	System.out.println(" Manufacturer: "+manufacturer+" engine_cc: "+engine_cc);
}

}
