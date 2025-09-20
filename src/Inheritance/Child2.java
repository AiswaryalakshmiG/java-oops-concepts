package Inheritance;

public class Child2 extends Parent{
public static void main(String[] args) {
	Child2 ch = new Child2();
	System.out.println("Parent amount: " + ch.amount);
	ch.takeBike();
	ch.play();
}

void play() {
	System.out.println("Playing with friends");
}

}
