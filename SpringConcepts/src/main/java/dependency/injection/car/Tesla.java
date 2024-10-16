package dependency.injection.car;

import org.springframework.stereotype.Component;
import dependency.injection.interfaces.Car;

@Component("tesla")
public class Tesla implements Car {

	@Override
	public void specs() {
		System.out.println("Electric Car");

	}

}
