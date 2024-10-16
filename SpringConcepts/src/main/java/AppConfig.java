import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.beans.car.Kia;
import spring.beans.car.Tesla;
import spring.beans.specs.EngineType;

@Configuration
@ComponentScan("spring.beans")
public class AppConfig {
	
	@Bean("tesla")
	public Tesla tesla() {
		return new Tesla();
	}
	
	@Bean("kia")
	public Kia kia() {
		return new Kia();
	}
	
	@Bean("unknownEngine")
	public EngineType enginetype() {
		return new EngineType();
	}
	
	@Bean("V6Engine")
	public EngineType V6type() {
		return new EngineType("V6 Engine");
	}

}
