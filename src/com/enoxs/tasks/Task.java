package com.enoxs.tasks;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public abstract class Task {
    ApplicationContext context;
    AbstractApplicationContext abstractContext;
    ConfigurableApplicationContext configContext;
    XmlBeanFactory factory;

    public abstract void runTask();
    abstract void runTask1();
    abstract void runTask2();
    abstract void runTask3();
    abstract void runTask4();
    abstract void runTask5();
    abstract void runTask6();
    abstract void runTask7();
    abstract void runTask8();
    abstract void runTask9();
    abstract void runTask10();


}
