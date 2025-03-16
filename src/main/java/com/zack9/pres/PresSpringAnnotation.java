package com.zack9.pres;

import com.zack9.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.zack9");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
