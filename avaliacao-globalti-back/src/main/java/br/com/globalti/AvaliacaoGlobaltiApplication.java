package br.com.globalti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AvaliacaoGlobaltiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoGlobaltiApplication.class, args);
	}

}
