package com.newyeah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer {
	
	public static WebApplicationContext ctx = null;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources();
    }

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return ctx = super.run(application); 
	}
    
	public static void main(String[] args) {
		ctx = (WebApplicationContext)SpringApplication.run(Application.class, args);
		for(String n : ctx.getBeanDefinitionNames()){
			System.out.println(n);
		}
		System.out.println(ctx.getBeanDefinitionCount());
	}
	
}