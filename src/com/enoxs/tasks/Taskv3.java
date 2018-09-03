package com.enoxs.tasks;

import com.enoxs.MainApp;
import com.enoxs.datadef.*;
import com.enoxs.jdbc.*;
import com.enoxs.mybatis.model.User;
import com.enoxs.transaction.StudentMarks;
import com.enoxs.transaction.ProgrammaticJDBCTemplate;
import com.enoxs.transaction.StudentsDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

public class Taskv3 extends Task{
//    static Log log = LogFactory.getLog(Taskv3.class.getName());
    static Logger log = Logger.getLogger(Taskv3.class.getName());
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
//        runTask2();
//        runTask3();
//        runTask4();
//        runTask5();
//        runTask6();
        runTask7();
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

    /**
     * SQL Stored Procedure in Spring
     * The SimpleJdbcCall class
     */

    @Override
    void runTask3() {
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(11);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }

    /**
     * Transaction Management
     * Programmatic Transaction Management
     */
    @Override
    void runTask4() {
        ProgrammaticJDBCTemplate studentsJDBCTemplate =
                (ProgrammaticJDBCTemplate)context.getBean("studentsJDBCTemplate");
/*
        System.out.println("------Records creation--------" );
        studentsJDBCTemplate.create("Zara", 11, 99, 2010);
        studentsJDBCTemplate.create("Nuha", 20, 97, 2010);
        studentsJDBCTemplate.create("Ayan", 25, 100, 2011);
*/

        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentsJDBCTemplate.listStudents();

        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }

    /**
     * Transaction Management
     * Declarative Transaction Management
     */
    @Override
    void runTask5() {
        StudentsDAO studentJDBCTemplate =
                (StudentsDAO)context.getBean("studentJDBCTemplate");

        System.out.println("------Records creation--------" );
        studentJDBCTemplate.create("Zara", 11, 99, 2010);
        studentJDBCTemplate.create("Nuha", 20, 97, 2010);
        studentJDBCTemplate.create("Ayan", 25, 100, 2011);

        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();

        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }

    }

    /**
     * Log4j
     */

    @Override
    void runTask6() {
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");
    }

    /**
     * MyBatis Demo
     */




    @Override
    void runTask7() {
        SqlSession session = MainApp.sqlSessionFactory.openSession();
        try {
            User user = (User) session.selectOne("com.enoxs.mybatis.model.UserMapper.selectUserByID", 1);
            System.out.println(user.getUserAddress());
            System.out.println(user.getUserName());
        } finally {
            session.close();
        }
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
