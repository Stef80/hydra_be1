package net.agm.hydra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;





@SpringBootApplication//(exclude = { SecurityAutoConfiguration.class })
@EnableAuthorizationServer
public class HydraApplication {

	public static void main(String[] args) {
		SpringApplication.run(HydraApplication.class, args);
	}

	
}
