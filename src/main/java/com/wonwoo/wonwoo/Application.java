package com.wonwoo.wonwoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication // @Configuration ,@EnableAutoConfiguration,@ComponentScan 포함. 상세는 Ctrl + Click 하면 볼 수 있음
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
