package com.enoxs.datadef;

public class ObjectTypeB {
    private String message;
    private String message1;
    private String message2;
    private String message3;
    public void setMessage(String message) {
        this.message = message;
    }
    public void setMessage1(String message){
        this.message1  = message;
    }
    public void setMessage2(String message){
        this.message2  = message;
    }
    public void setMessage3(String message){
        this.message3  = message;
    }
    public void getMessage() {
        System.out.println("Message -> " + message);
    }
    public void getMessage1(){
        System.out.println("Message1 -> " + message1);
    }
    public void getMessage2(){
        System.out.println("Message2 -> " + message2);
    }
    public void getMessage3(){
        System.out.println("Message3 -> " + message3);
    }
}
