package spring.beans.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.beans.interfaces.Car;
import spring.beans.interfaces.Engine;

public class Kia implements Car {
	
	@Autowired(required = false)
	@Qualifier("V6Engine")
	Engine engine;


	@Override
	public void specs() {
		System.out.println("Gas/Hybrid/Electic Car with engine "+engine.specs());

	}

}
