package com.comcast.springboot2test;

import io.undertow.UndertowOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot2TestApplication {


	@Bean
	UndertowServletWebServerFactory embeddedServletContainerFactory() {
		UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
		factory.addBuilderCustomizers(
				builder -> builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true));
		return factory;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2TestApplication.class, args);
	}
}
