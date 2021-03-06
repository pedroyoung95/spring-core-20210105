package spring_ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//component어노테이션을 사용하면 
//bean태그 없이 클래스 이름을 사용해서 
//bean클래스를 자동으로 만듦
public class Car {
	
	private Tire tire;

	public Tire getTire() {
		return tire;
	}
	
	@Autowired
	//set메소드에 자동으로 주입하라고 명시하는 어노테이션
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
