package sub2;

public class Truck implements Car{

	private String name;
	private String color;
	private int speed;
	
	
	public Truck (String name, String color, int speed) {
		this.color = color;
		this.name = name;
		this.speed = speed;
	}


	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}


	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}


	@Override
	public void show() {
		System.out.println("차량 명 : "+name);
		System.out.println("차량 색 : "+color);
		System.out.println("차량 속도 : "+speed);
	}
	
	
	
}
