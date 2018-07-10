package com.lxy.springcore.xml;

import com.lxy.springcore.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        XmlShapeCompute xmlShapeCompute = (XmlShapeCompute) context.getBean("shapeCompute");
        Shape shape = xmlShapeCompute.computeShape(args[0]);
        System.out.println(shape);
    }
}
