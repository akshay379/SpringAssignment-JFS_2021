package Springcore_qn7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("Springcore_qn7/config.xml");
 Demo d1=context.getBean("demo",Demo.class);// we passed the literal demo.class for not using the typecasting
// above  we have got the object &  have stored it in d1
 System.out.println(d1);// this will call the tostring method
	}

}
