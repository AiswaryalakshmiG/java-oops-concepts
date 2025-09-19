package encapsulation;

public class Myself {
//private variables
private int atm_pin = 1234;
private int password = 1234;
int bike_key = 12; // default variable
public static void main(String[] args) {
	Myself aishu = new Myself();
	System.out.println("ATM pin: "+aishu.atm_pin);
	System.out.println("Passeord: " + aishu.password);
aishu.set_atm_pin();
System.out.println("Bike key: "+ aishu.bike_key);

}
//private methhods
private void set_atm_pin() {
	System.out.println("setting new atm pin number");
}
//default -> same package can access
void take_bike() {
System.out.println("Bike Ride");
}

}
