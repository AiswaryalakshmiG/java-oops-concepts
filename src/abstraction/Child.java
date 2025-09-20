package abstraction;

public class Child extends Parent{
public static void main(String[] args) {
	Child ch = new Child();
	ch.study();
	ch.grow();
}

@Override
void study() {
System.out.println("college");
}
}
