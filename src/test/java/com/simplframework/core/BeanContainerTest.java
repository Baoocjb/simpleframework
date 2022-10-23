package com.simplframework.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.simpleframework.core.BeanContainer;

public class BeanContainerTest {

    private static BeanContainer beanContainer;

    @BeforeAll
    static void init(){
        beanContainer = BeanContainer.getInstance();
    }

    @Test
    public void test1(){
        Assertions.assertEquals(false, beanContainer.getloaded());
        beanContainer.loadBeans("com.bao");
        Assertions.assertEquals(6, beanContainer.beanSize());
        Assertions.assertEquals(true, beanContainer.getloaded());
    }
}
