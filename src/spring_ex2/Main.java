package spring_ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ex2/context.xml");
		
//		spring_ex2.Tire tire1 = new spring_ex2.Tire();
//		spring_ex2.Car car = new spring_ex2.Car(tire1);
		//위 두 줄의 코드가 context.xml에서 일어난 일
		
		Object t1 = context.getBean("tire1");
		System.out.println(t1);
		
		Object c = context.getBean("car");
		System.out.println(c);
		Car c1 = (Car) c;
		System.out.println(c1.getTire());
	}
}
