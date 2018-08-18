package com.enoxs.datadef;

import org.springframework.beans.factory.annotation.Autowired;

public class ObjectTypeC1 {
    private Integer no;
    private String name;

    @Autowired(required=false)
    public void setNo(Integer no) {
        this.no = no;
    }
    public Integer getNo() {
        return no;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
