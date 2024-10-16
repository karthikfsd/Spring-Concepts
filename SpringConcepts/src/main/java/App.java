import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.beans.interfaces.Car;

//import dependency.injection.car.Kia;
//import dependency.injection.car.Tesla;


public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("kia", Car.class);
		myCar.specs();
		context.close();

	}

}
