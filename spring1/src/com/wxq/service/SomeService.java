package com.wxq.service;

public class SomeService implements com.wxq.inservice.Service{
	
	public SomeService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("service���󱻴�����");
	}
	
	public void init(){
		System.out.println("�����ʼ������");
	}
	
	public void destory(){
		System.out.println("�������ٷ���");
	}

	public void doSome(){
		System.out.println("------dosome����--------");
	}
}
