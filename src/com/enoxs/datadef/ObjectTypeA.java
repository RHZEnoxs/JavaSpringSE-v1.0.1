package com.enoxs.datadef;

public class ObjectTypeA {
	/**
	 * Hello World Example
	 */
	private String message;
	public void init(){
		System.out.println("init Object Type A (Bean).");
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage() {
		System.out.println("Message -> " + message);
	}
	public void destroy(){
		System.out.println("destroy Object Type A (Bean).");
	}

	public void start(){
		System.out.println("start Object Type A (Bean).");
	}
	public void stop(){
		System.out.println("stop Object Type A (Bean).");
	}
}
