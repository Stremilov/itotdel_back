package com.itotdel.itotdel_back;

import com.itotdel.itotdel_back.configuration.ItotdelConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ItotdelConfig.class)
public class ItotdelBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItotdelBackApplication.class, args);
	}

}
