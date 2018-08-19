package com.enoxs.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ObjectTypeFJDBCTemplate implements ObjectTypeFDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String name, Integer age) {
        String SQL = "insert into Student(name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public ObjectTypeF getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        ObjectTypeF student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new ObjectTypeFMapper());

        return student;
    }
    public List<ObjectTypeF> listStudents() {

        String SQL = "select * from student";
        List <ObjectTypeF> students = jdbcTemplateObject.query(SQL, new ObjectTypeFMapper());
        return students;
    }
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }
    public void update(Integer id, Integer age){
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}
