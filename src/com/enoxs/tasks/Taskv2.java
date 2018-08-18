package com.enoxs.tasks;

import com.enoxs.datadef.*;
import com.enoxs.event.CustomEventPublisher;
import com.enoxs.injection.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Taskv2 extends Task{
    ApplicationContext context;
    AbstractApplicationContext abstractContext;
    ConfigurableApplicationContext configContext;
    public Taskv2(){
    }
    public Taskv2(ApplicationContext context){
        this.context = context;
    }
    public Taskv2(AbstractApplicationContext context){
        this.abstractContext = context;
    }
    public Taskv2(ConfigurableApplicationContext context){
        this.configContext = context;
    }

    public void runTask(){
//        runTask1();
//        runTask2();
//        runTask3();
//        runTask4();
//        runTask5();
//        runTask6();
//        runTask7();
//        runTask8();
//        runTask9();
        runTask10();
    }

    /**
     * Spring - Annotation Based Configuration
     * @Required Annotation
     * @Autowired Annotation
     * @Qualifier Annotation
     */
    void runTask1(){
//        @Required Annotation
//        ObjectTypeC objectTypeC = (ObjectTypeC) context.getBean("objectTypeC");
//        System.out.println("Name : " + objectTypeC.getName() );
//        System.out.println("No : " + objectTypeC.getNo() );

//        @Autowired on Setter Methods
//        TextSEv3 te = (TextSEv3) context.getBean("textSEv3");
//        te.spellCheck();

//        @Autowired on Properties

//        TextSEv3_1 te3_1 = (TextSEv3_1) context.getBean("textSEv3_1");
//        te3_1.spellCheck();

//        @Autowired on Constructors

//        TextSEv3_2 te3_2 = (TextSEv3_2) context.getBean("textSEv3_2");
//        te3_2.spellCheck();

//        @Autowired with (required=false) option

//        ObjectTypeC1 objectTypeC1 = (ObjectTypeC1) context.getBean("objectTypeC1");
//        System.out.println("Name : " + objectTypeC1.getName() );
//        System.out.println("No : " + objectTypeC1.getNo() );

//        @Qualifier Annotation
        ObjectTypeD objectTypeD = (ObjectTypeD) context.getBean("objectTypeD");
        objectTypeD.printName();
        objectTypeD.printNo();

    }

    /**
     * JSR-250 Annotations
     * @PostConstruct and @PreDestroy Annotations
     * @Resource Annotation
     */
    void runTask2(){
//        @PostConstruct and @PreDestroy Annotations

//        ObjectTypeE obj = (ObjectTypeE) abstractContext.getBean("objectTypeE");
//        obj.getMessage();
//        abstractContext.registerShutdownHook();

//        @Resource Annotation
        TextSEv3_3 te3_3 = (TextSEv3_3) context.getBean("textSEv3_3");
        te3_3.spellCheck();
    }

    /**
     * Spring - Java Based Configuration
     */

    void runTask3(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ObjectTypeAConfig.class);
        ObjectTypeA objTypA = ctx.getBean(ObjectTypeA.class);
        objTypA.setMessage("Hello World!");
        objTypA.getMessage();
    }
    /**
     * Injecting Bean Dependencies
     */
    void runTask4(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextSEv0Config.class);
        TextSEv0 te = ctx.getBean(TextSEv0.class);
        te.spellCheck();
    }
    /**
     * The @Import Annotation
     */
    void runTask5(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ObjectTypeBConfig.class);
        // now both beans A and B will be available...
        ObjectTypeAConfig a = ctx.getBean(ObjectTypeAConfig.class);
        ObjectTypeBConfig b = ctx.getBean(ObjectTypeBConfig.class);
        ObjectTypeA objA = a.objectTypeA();
        ObjectTypeA objB = b.objectTypeA();
        objA.setMessage("a12");
        objB.setMessage("b21");
        a.objectTypeA().getMessage();
        b.objectTypeA().getMessage();
    }
    /**
     * Lifecycle Callbacks
     */
    void runTask6(){
        AbstractApplicationContext  ctx = new AnnotationConfigApplicationContext(ObjectTypeAConfig.class);
        ObjectTypeA objTypA = ctx.getBean(ObjectTypeA.class);
        objTypA.setMessage("Hello World!");
        objTypA.getMessage();
        ctx.registerShutdownHook();
    }
    /**
     * Specifying Bean Scope
     */
    void runTask7(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ObjectTypeAConfig.class);
        ObjectTypeA objTypA = ctx.getBean(ObjectTypeA.class);

        objTypA.setMessage("Hello World #1 !!! ");
        objTypA.getMessage();

        ObjectTypeA objTypB = ctx.getBean(ObjectTypeA.class);
        objTypB.setMessage("Hello World #2 !!! ");
        objTypB.getMessage();
    }
    /**
     * Event Handling in Spring
     */
    void runTask8(){
        configContext.start();
        ObjectTypeA objA = (ObjectTypeA) configContext.getBean("objectTypeA");
        objA.setMessage("Object Type A");
        objA.getMessage();
        // Let us raise a stop event.
        configContext.stop();
    }
    /**
     * Custom Events in Spring
     */
    void runTask9(){
        CustomEventPublisher cvp = (CustomEventPublisher) configContext.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
    }

    /**
     * AOP - Aspect Orientied Programming
     * XML Schema Based AOP with Spring
     * @AspectJ Based AOP with Spring
     */
    void runTask10() {
        ObjectTypeC3 student = (ObjectTypeC3) context.getBean("student");
        student.getName();
        student.getNo();
        student.printThrowException();
    }

}
