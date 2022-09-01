package sub2;

public class Sedan implements Car{

	
	private String name;
	private String color;
	private int speed;
	
	
	public Sedan(String color,String name,int speed) {
		this.name = name;
		this.color = color;
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
		System.out.println("차량 명 :" +name);
		System.out.println("차량 색 :" +color);
		System.out.println("차량 속도 :" +speed);
	}
	

}
