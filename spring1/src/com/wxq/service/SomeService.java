package com.wxq.service;

public class SomeService implements com.wxq.inservice.Service{
	
	public SomeService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("service对象被创建了");
	}
	
	public void init(){
		System.out.println("对象初始化方法");
	}
	
	public void destory(){
		System.out.println("对象销毁方法");
	}

	public void doSome(){
		System.out.println("------dosome方法--------");
	}
}
