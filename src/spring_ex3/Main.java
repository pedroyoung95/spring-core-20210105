package spring_ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ex3/context.xml");
		
		Object b1 = context.getBean("car");
		System.out.println(b1);
		
		Object b2 = context.getBean("tire");
	}
}
