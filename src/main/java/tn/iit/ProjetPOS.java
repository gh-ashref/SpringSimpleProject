package tn.iit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "tn.iit")

public class ProjetPOS {

	public static void main(String[] args) {
		SpringApplication.run(ProjetPOS.class, args);
	}
}
