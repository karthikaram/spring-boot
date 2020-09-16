package io.workshop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(value = "")
@ComponentScan(basePackages = "io.workshop")
public class ApplicationConfig {
	
	
}
