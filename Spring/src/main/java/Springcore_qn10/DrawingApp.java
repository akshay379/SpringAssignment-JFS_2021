package Springcore_qn10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp 
{
 
 public static void main(String[] args) 
 {
ApplicationContext context = new ClassPathXmlApplicationContext("Springcore_qn10/config.xml");
Triangle triangle = (Triangle) context.getBean("triangle");
triangle.draw();
 }
}