package sub1;

// 클래스 정의


public class Car {
	
	
	
	// 6개의 멤버로 구성된 car 클래스다.
	
	
	// 자동차의 속성(변수)
	String name;
	String color;
	int speed;
	
	
	// 자동차의 기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	public void show() {
		System.out.println("차랑명 : "+name);
		System.out.println("차랑색 : "+color);
		System.out.println("속도 : "+speed);
	}
	
	
}
