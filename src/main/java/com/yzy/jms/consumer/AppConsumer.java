package com.yzy.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yezhaoyi on 2017/7/15.
 */
public class AppConsumer {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }
}
