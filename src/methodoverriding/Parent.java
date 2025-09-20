package methodoverriding;

public class Parent {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.get_admission();
	}

	void get_admission() {
		System.out.println("Engineering");
	}
}
