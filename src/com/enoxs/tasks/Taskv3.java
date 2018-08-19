package com.enoxs.tasks;

import com.enoxs.datadef.*;
import com.enoxs.event.CustomEventPublisher;
import com.enoxs.injection.TextSEv0;
import com.enoxs.injection.TextSEv3_3;
import com.enoxs.jdbc.ObjectTypeF;
import com.enoxs.jdbc.ObjectTypeFJDBCTemplate;
import com.enoxs.jdbc.Student;
import com.enoxs.jdbc.StudentJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Taskv3 extends Task{
    ApplicationContext context;
    AbstractApplicationContext abstractContext;
    ConfigurableApplicationContext configContext;
    public Taskv3(){
    }
    public Taskv3(ApplicationContext context){
        this.context = context;
    }
    public Taskv3(AbstractApplicationContext context){
        this.abstractContext = context;
    }
    public Taskv3(ConfigurableApplicationContext context){
        this.configContext = context;
    }

    public void runTask(){
//        runTask1();
        runTask2();
    }
    /**
     * @AspectJ Based AOP with Spring
     */
    @Override
    void runTask1() {
        ObjectTypeC3 objectTypeC3 = (ObjectTypeC3) context.getBean("objectTypeC3");
        objectTypeC3.getName();
        objectTypeC3.getNo();
//        objectTypeC3.printThrowException();
    }
    /**
     *Spring JDBC Example
     */
    @Override
    void runTask2() {
        ObjectTypeFJDBCTemplate studentJDBCTemplate =
                (ObjectTypeFJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<ObjectTypeF> students = studentJDBCTemplate.listStudents();

        for (ObjectTypeF record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----" );
        ObjectTypeF student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }

    @Override
    void runTask3() {

    }

    @Override
    void runTask4() {

    }

    @Override
    void runTask5() {

    }

    @Override
    void runTask6() {

    }

    @Override
    void runTask7() {

    }

    @Override
    void runTask8() {

    }

    @Override
    void runTask9() {

    }

    @Override
    void runTask10() {

    }
}
