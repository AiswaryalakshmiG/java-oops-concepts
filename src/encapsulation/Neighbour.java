package encapsulation;

public class Neighbour {
	public static void main(String[] args) {
		Myself jeeva = new Myself();
		// System.out.println("ATM pin: "+jeeva.atm_pin);
		// System.out.println("Passeord: " + jeeva.password);
		//jeeva.set_atm_pin();//private method cannot be access
		jeeva.take_bike();//default method
		System.out.println("Bike key: "+ jeeva.bike_key);

	}
}
