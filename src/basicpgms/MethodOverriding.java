package basicpgms;

/**
 * @author Ananda Lakshmi Vivekananthan
 */
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Parent{
	public void display(){
		System.out.println("this is parent class");

	};
}

class Sibling1 extends Parent{
	public void display(){
		System.out.println("this is sibling 1");
	}
}


class Sibling2 extends Parent{
	public void display(){
		System.out.println("this is sibling 2");
	}
}

class MethodOverriding{
	public static void main(String[] args){
		Parent sib1 = new Sibling1();
		sib1.display();
		Parent sib2 = new Sibling2();
		sib2.display();
		Parent par = new Parent();
		par.display();

	}
}
