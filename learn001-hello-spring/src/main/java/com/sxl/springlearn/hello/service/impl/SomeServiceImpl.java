package com.sxl.springlearn.hello.service.impl;

import com.sxl.springlearn.hello.service.SomeService;

/**
 *
 */
public class SomeServiceImpl implements SomeService {

    /**
     * spring默认使用的无参数构造方法，创建对象。
     * 如果定义了有参数构造方法， 应该在定义无参数构造方法
     */
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参数构造方法");
    }

    public void doSome() {
        System.out.println("执行了业务方法doSome()");
    }
}
