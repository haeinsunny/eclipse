package co.sunny.complex;

import co.sunny.interfaceTest.InterfaceTestA;
import co.sunny.abstractclass.AbstractClass;

public class MainApp {
	
	public static void main(String[] args) {
	
	ComplexTest ct = new ComplexTest();
	ct.eat();
	ct.run();
	ct.sound();
	ct.funcA();
	
	
	InterfaceTestA ia = new ComplexTest();
	ia.funcA();
	ct.Happy();
	
	AbstractClass as = new ComplexTest();
	as.eat();
	as.run();
	as.sound();
	}
}
