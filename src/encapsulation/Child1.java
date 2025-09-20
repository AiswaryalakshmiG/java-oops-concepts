package encapsulation;
//Hierarchical Inheritance
import Inheritance.Child2;
import Inheritance.Parent;

public class Child1 extends Parent{
public static void main(String[] args) {
	Child1 ch = new Child1();
	System.out.println("Parent amount: " + ch.amount);
	//cannot access becz amt and takebike(package private) default
	ch.takeBike(); // protected-> diff package but child can be access
	//System.out.println(ch.atm_pin);
	//private variable cannot be access even it is parent

}
}
