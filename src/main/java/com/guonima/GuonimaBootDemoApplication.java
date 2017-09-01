package com.guonima;

import com.guonima.beans.ConfigBeans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBeans.class})
public class GuonimaBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuonimaBootDemoApplication.class, args);
	}
}
