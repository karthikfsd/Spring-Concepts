package spring.beans.car;

import dependency.injection.interfaces.Car;

public class Tesla implements Car {

	@Override
	public void specs() {
		System.out.println("Electric Car");

	}

}
