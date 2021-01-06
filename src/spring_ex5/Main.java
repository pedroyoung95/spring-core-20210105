package spring_ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ex5/context.xml");
		
		Object b1 = context.getBean("car");
		System.out.println(((Car) b1).getTire());
		//Component어노테이션을 안 붙이고 
		//xml에서 따로 bean태그(요소)로 작성해서 bean객체 생성 가능
	}
}
