package com.enoxs.datadef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ObjectTypeD {
    @Autowired
    @Qualifier("objTypC2")
    private ObjectTypeC objectTypeC;

    public ObjectTypeD(){
        System.out.println("Inside Profile constructor." );
    }
    public void printNo() {
        System.out.println("Age : " + objectTypeC.getNo() );
    }
    public void printName() {
        System.out.println("Name : " + objectTypeC.getName() );
    }
}
