package co.sunny.complex;

import co.sunny.abstractclass.AbstractClass;
import co.sunny.interfaceTest.InterfaceTestA;

public class ComplexTest extends AbstractClass implements InterfaceTestA {

	
	public void funcA() {
		System.out.println("aaaaaaaa");
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
      System.out.println("run~~~~");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
     System.out.println("BB~~~~~~");
	}

}
