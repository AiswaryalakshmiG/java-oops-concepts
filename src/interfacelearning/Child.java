package interfacelearning;

public class Child extends Parent implements TrafficRules{
	public static void main(String[] args) {
		Child ch = new Child();
		ch.study();
		ch.wear_helmet();
		System.out.println("Fine amount: " + Child.fine);// static variable can be access using class name or interface name
	}

	@Override
	void study() {
System.out.println("Study Well");
		
	}

	@Override
	public void wear_helmet() {
		System.out.println("Wear helmet while traveling");
		
	}

}
