package methodoverriding;

public class Child extends Parent {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.get_admission();

	}
//same method name with same type of data in 2 diff calsses
	void get_admission() {
		System.out.println("Law");
	}
}
