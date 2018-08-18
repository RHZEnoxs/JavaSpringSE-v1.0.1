package com.enoxs.datadef;

public class ObjectTypeC3 {
    private Integer no;
    private String name;

    public void setNo(Integer no) {
        this.no = no;
    }
    public Integer getNo() {
        System.out.println("No : " + no);
        return no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
