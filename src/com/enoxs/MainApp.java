package com.enoxs;

import com.enoxs.tasks.Taskv3;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	ApplicationContext context;
	XmlBeanFactory factory;
	AbstractApplicationContext abstractContext;
	ConfigurableApplicationContext configContext;
	public MainApp(){
		init();
	}
	void init(){
		initContainer();
		initTask();
	}
	/**
	 * 1. ApplicationContext Container
	 * 2. BeanFactory Container
	 * 3. AbstractApplicationContext Container
	 * 4. AbstractApplicationContext Container with LifeCycle1.xml
	 * 5. ConfigurableApplicationContext Container
	 */
	void initContainer(){
		/**
		 * 1.
		 * Taskv1.1 | Taskv1.2 | Taskv1.6
		 */
//		context = new ClassPathXmlApplicationContext("Beans.xml");
//		context = new FileSystemXmlApplicationContext("src/Beans.xml");

		//2.
//		XmlBeanFactory factory;//BeanFactory Container
//		factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));

		/**
		 * 3.
		 * Taskv1.3 | Taskv1.5
		 */
//		abstractContext = new ClassPathXmlApplicationContext("LifeCycle1.xml");
		/**
		 * 4.
		 * Taskv1.4
		 */
//		abstractContext = new ClassPathXmlApplicationContext("LifeCycle2.xml");

		/**
		 * 5.
		 * Taskv2.1
		 */
//		context = new ClassPathXmlApplicationContext("Annotations.xml");
		/**
		 * 6.
		 * Taskv2.2
		 */
//		abstractContext = new ClassPathXmlApplicationContext("LifeCycle3.xml");
		/**
		 * 7.
		 * Taskv2.2
		 */
//		context = new ClassPathXmlApplicationContext("LifeCycle3.xml");
		/**
		 * 8.
		 * Taskv2.3
		 */
//		configContext = new ClassPathXmlApplicationContext("Beans.xml");
		/**
		 * 9.
		 * Taskv2.10
		 */
//		context = new ClassPathXmlApplicationContext("Aop.xml");
		/**
		 * 10.
		 * Taskv3.2
		 */
		context = new ClassPathXmlApplicationContext("JDBC.xml");
		/**
		 * 11.
		 * Taskv3.4
		 */
		context = new ClassPathXmlApplicationContext("ProgrammaticTransaction.xml");
		/**
		 * 12.
		 * Taskv3.5
		 */
		context = new ClassPathXmlApplicationContext("DeclarativeTransaction.xml");
	}
	void initTask(){
//		new Taskv1(context).runTask();// 1.
//		new Taskv1(abstractContext).runTask();// 3. 4.
//		new Taskv2(context).runTask();// 5. 7.
//		new Taskv2(abstractContext).runTask();// 6.
//		new Taskv2().runTask();// 5. 7.
//		new Taskv2(configContext).runTask();// 8.
//		new Taskv2(context).runTask();// 9.
		new Taskv3(context).runTask();// 10. 11.
//		new Taskv3().runTask();// 10.
	}
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		new MainApp();
	}
}
