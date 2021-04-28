package mc.sn.practice;

public class Circle extends Shape {
	public Circle() {
		super();
	}
	
	@Override
	//오버라이딩: 다형성의 핵심, 하위객체에 맞추어 동작방식을 바꾸어 주는 것
	public void draw() {
		System.out.println("circle");
	}
}
