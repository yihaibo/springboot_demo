package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 在这里我们使用@SpringBootApplication指定这是一个 spring boot的应用程序.
 * @author yhb
 */
//extends WebMvcConfigurerAdapter
@SpringBootApplication
//@EnableTransactionManagement 
@MapperScan("com.demo.dao")
@EnableSwagger2
public class App{
	
	/**
	 * 这是springloader的配置方式：-javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 在main方法进行启动我们的应用程序.
		 */
		SpringApplication.run(App.class, args);
	}
}
