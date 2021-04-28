package mc.sn.day6;

public class MainClass {
	public static void main(String[] args) {
		//프로그램 최초 시작 포인트
		MainClass mc=new MainClass();
		mc.testPoly();
		mc.testOperator();
	}
	
	
	public void testOperator() {
		int x=10;
		int y=10;
		System.out.println(x++);
		System.out.println(++y);
	}


	public void testPoly() {
		System.out.println("test 메소드입니다.");
		Shape shape=new Shape(); //Shape 클래스의 인스턴스 생성
		shape.draw();
		
		//Circle 클래스 인스턴스 생성하여 Shape타입에 할당
		Shape circle=new Circle(); //상속관계이므로 자동 할당됨
		circle.draw();
		
		//Line 클래스 인스턴스 생성하여 Shape타입에 할당
		//Shape line=new Line(); //에러 발생(Shape과 Line은 상속관계X 자기 클래스 타입만 할당 가능)
		
		System.out.println("------------------------------------");
		
		Shape[] shapes= {circle, new Rectangle(), new Triangle()};
		for(Shape s: shapes) {
			s.draw();
		}
	}
}