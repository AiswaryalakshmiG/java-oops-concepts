package Inheritance;

public class Parent {
	protected int amount = 1000;
private int atm_pin =1234;
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.takeBike();
		System.out.println(parent.atm_pin);
	}

	protected void takeBike() {
		System.out.println("Bike Riding");
	}
}
