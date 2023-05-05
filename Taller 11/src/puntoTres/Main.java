package puntoTres;

public class Main {

	public static void main(String[] args) {
		B a = new B(); 
		B b = new B();
		C d = new C(); 
		E e = new E();
		C c = new C(); 
		b.methodA(); 
		e.methodA();
		c.methodC(); 
		
		System.out.print(a);
		System.out.print(d);
		System.out.print(b);
		System.out.print(e);
		System.out.print(c);
	}
}
