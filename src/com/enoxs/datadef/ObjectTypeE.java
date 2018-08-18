package com.enoxs.datadef;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ObjectTypeE {
	/**
	 * JSR-250 Annotations
	 */
	private String message;
	@PostConstruct
	public void init(){
		System.out.println("init Object Type E (Bean).");
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage() {
		System.out.println("Message -> " + message);
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy Object Type E (Bean).");
	}
}
