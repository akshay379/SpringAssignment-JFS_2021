package Springcore_qn2;

import static org.junit.Assert.*;


import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class QuestionTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Springcore_qn2/config.xml");
		Object que = context.getBean("question");
		
		assertEquals(que.getClass().getSimpleName(), "Question");
	}

}