package com.reunion.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reunion.demo.model.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		
		Persona carlos = null;
		carlos = appContext.getBean("informacion", Persona.class);
		
		System.out.println(carlos);
		
		((AbstractApplicationContext) appContext).close();
		

	}

}
