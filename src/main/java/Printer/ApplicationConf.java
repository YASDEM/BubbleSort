package Printer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConf {

	@Bean(name="girls")
	public P1 P1() {
		return new P1();
	}
	
	@Bean(name="boys")
	public P2 P2() {
		return new P2();
	}
	
	

}
