package com.yzy.jms.prodocer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by yezhaoyi on 2017/7/14.
 */
public class AppProder {
    public  static  void  main(String[] args){
        ClassPathXmlApplicationContext context  =  new ClassPathXmlApplicationContext("producer.xml");
        ProducerService    service  =  context.getBean(ProducerService.class);
        for(int i=0;i<100;i++){
            service.sendMessage("test"+i);
        }
        context.close();

    }
}
