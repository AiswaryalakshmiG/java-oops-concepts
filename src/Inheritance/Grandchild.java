package Inheritance;
//multilevel inheritance
public class Grandchild extends Child2{
public static void main(String[] args) {
	Grandchild gc = new Grandchild();
	System.out.println("Grand Parent Amount: "+ gc.amount);
	
	gc.takeBike();
	gc.play();
	gc.study();
}

private void study() {
	System.out.println("Studying");
	
}
}
