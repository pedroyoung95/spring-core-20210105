package spring_ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Tire tire;

	public Tire getTire() {
		return tire;
	}
	
	@Autowired
	//set메소드처럼 생성자에도 Autowired어노테이션을 붙이면 자동으로 주입이 이뤄짐
	//Tire bean객체를 받는 생성자가 하나밖에 없으므로, 어노테이션 생략 가능(이는 버전마다 다름)
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	
}
