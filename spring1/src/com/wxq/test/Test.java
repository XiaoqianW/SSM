package com.wxq.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.wxq.inservice.Service;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SomeService s = new SomeService();
//		s.doSome();
		//src
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//filesystem
		//FileSystemXmlApplicationContext()
		Service s = (Service) ctx.getBean("service");
		//Service s = ctx.getBean(Service.class);
		s.doSome();
		ctx.close();
	}

}
