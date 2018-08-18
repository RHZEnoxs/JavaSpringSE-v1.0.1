package com.enoxs.tasks;

import com.enoxs.datadef.ObjectTypeA;
import com.enoxs.datadef.ObjectTypeB;
import com.enoxs.datadef.ObjectTypeCollection;
import com.enoxs.injection.TextSEv0;
import com.enoxs.injection.TextSEv1;
import com.enoxs.injection.TextSEv2_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Taskv1 extends Task{
//    ApplicationContext context;
//    AbstractApplicationContext abstractContext;

    public Taskv1(ApplicationContext context){
        super.context = context;
    }
    public Taskv1(AbstractApplicationContext context){
        super.abstractContext = context;
    }
    public void runTask(){
//        runTask1();
//        runTask2();
//        runTask3();// abstractContext
//        runTask4();// abstractContext
//        runTask5();// abstractContext
//        runTask6();
//        runTask7();
//        runTask8();
//        runTask9();
        runTask10();
    }

    /**
     * Hello World Example
     */
    void runTask1(){
        ObjectTypeA obj = (ObjectTypeA) context.getBean("objectTypeA");
//		ObjectTypeA obj = (ObjectTypeA)factory.getBean("objectTypeA");
        obj.getMessage();
    }

    /**
     * Bean Scopes
     */
    void runTask2(){
        ObjectTypeA objA,objB;
        objA = (ObjectTypeA) context.getBean("objectTypeA");
        objA.setMessage("Object Type A");
        objA.getMessage();
        objB = (ObjectTypeA) context.getBean("objectTypeA");
        objB.getMessage();

        objA = (ObjectTypeA) context.getBean("objectTypeA1");
        objA.setMessage("Singleton");
        objA.getMessage();
        objB = (ObjectTypeA) context.getBean("objectTypeA1");
        objB.getMessage();

        objA = (ObjectTypeA) context.getBean("objectTypeA2");
        objA.setMessage("Prototype");
        objA.getMessage();
        objB = (ObjectTypeA) context.getBean("objectTypeA2");
        objB.getMessage();
    }
    /**
     * Bean Life Cycle :
     * init-method | destroy-method
     */
    void runTask3(){
        ObjectTypeA obj = (ObjectTypeA) abstractContext.getBean("objectTypeA");
        obj.getMessage();
        abstractContext.registerShutdownHook();
    }
    /**
     * Bean Life Cycle :
     * default-init-method = "init" default-destroy-method = "destroy"
     */
    void runTask4(){
        ObjectTypeA obj = (ObjectTypeA) abstractContext.getBean("objectTypeA");
        obj.getMessage();
        abstractContext.registerShutdownHook();
    }
    /**
     * Bean Post Processors
     */
    void runTask5(){
        ObjectTypeA obj = (ObjectTypeA) abstractContext.getBean("objectTypeA");
        obj.getMessage();
        abstractContext.registerShutdownHook();
    }
    /**
     * Bean Definition Inheritance
     * Bean Definition Template
     */
    void runTask6(){
        ObjectTypeA objA = (ObjectTypeA) context.getBean("objectTypeA");
        objA.getMessage();
        System.out.println();
        ObjectTypeB objB = (ObjectTypeB) context.getBean("objectTypeB");
        objB.getMessage();
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
        System.out.println();
        ObjectTypeB objB1 = (ObjectTypeB) context.getBean("objectTypeB1");
        objB1.getMessage();
        objB1.getMessage1();
        objB1.getMessage2();
        objB1.getMessage3();
    }
    /**
     * Spring - Dependency Injection
     * Constructor-based Dependency Injection
     * Setter-based Dependency Injection
     */
    void runTask7(){
        TextSEv0 te0 = (TextSEv0) context.getBean("textSEv0");
        te0.spellCheck();

        TextSEv1 te1 = (TextSEv1) context.getBean("textSEv1");
        te1.spellCheck();
    }
    /**
     * Spring - Injecting Inner Beans
     */
    void runTask8(){
        TextSEv1 te1 = (TextSEv1) context.getBean("textSEv1_1");
        te1.spellCheck();
    }
    /**
     * Spring - Injecting Collection
     */
    void runTask9(){
        ObjectTypeCollection jc=(ObjectTypeCollection)context.getBean("objectTypeCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
    /**
     * Spring - Beans Auto-Wiring
     * Autowiring 'byName'
     * Autowiring 'byType'
     * Autowiring by Constructor
     */
    void runTask10(){
//        Autowiring 'byName'
//        TextSEv2 te2 = (TextSEv2) context.getBean("textSEv2");
//        te2.spellCheck();
//        Autowiring 'byType'
//        TextSEv2 te2_1 = (TextSEv2) context.getBean("textSEv2_1");
//        te2_1.spellCheck();
        TextSEv2_2 te2_2 = (TextSEv2_2) context.getBean("textSEv2_2");
        te2_2.spellCheck();
    }
}
