package dependency.injection.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.injection.interfaces.Car;

@Component("kia")
public class Kia implements Car {
	
	@Autowired(required = false)
	@Qualifier("v8")
	Engine engine;

	@Autowired(required = false)
	public void setEngine(Engine engine) {
		engine.type = "V10";
		this.engine = engine;
	}


	@Override
	public void specs() {
		System.out.println("Gas/Hybrid/Electic Car with engine "+ engine.type);

	}

}
