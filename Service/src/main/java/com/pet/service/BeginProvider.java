package com.pet.service;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liyut on 2017-12-11.
 */
public class BeginProvider {
    public static void main(String args[])throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.printf("服务提供方开始服务");
        System.in.read();

    }
}
