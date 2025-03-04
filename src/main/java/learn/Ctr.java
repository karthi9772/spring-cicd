package learn;

import org.springframework.stereotype.Controller;


@Controller
public class Ctr {
	static void hello() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		hello();
		A obj=new A();
		obj.meth();
	}
}
