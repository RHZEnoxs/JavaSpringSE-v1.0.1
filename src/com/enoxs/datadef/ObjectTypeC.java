package com.enoxs.datadef;

import org.springframework.beans.factory.annotation.Required;

public class ObjectTypeC {
    private Integer no;
    private String name;

    @Required
    public void setNo(Integer no) {
        this.no = no;
    }
    public Integer getNo() {
        return no;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
