package com.enoxs.datadef;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitObjectTypeA implements BeanPostProcessor {
    /**
     * Bean Post Processors -> 後製處理器
     */
    public Object postProcessBeforeInitialization(Object bean,String beanName)throws BeansException {
        System.out.println("Before Initialization : " + beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean,String beanName)throws BeansException{
        System.out.println("After Initialization : " + beanName);
        return bean;
    }
}
