package mc.sn.day6;

public class MainClass {
	public static void main(String[] args) {
		//���α׷� ���� ���� ����Ʈ
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
		System.out.println("test �޼ҵ��Դϴ�.");
		Shape shape=new Shape(); //Shape Ŭ������ �ν��Ͻ� ����
		shape.draw();
		
		//Circle Ŭ���� �ν��Ͻ� �����Ͽ� ShapeŸ�Կ� �Ҵ�
		Shape circle=new Circle(); //��Ӱ����̹Ƿ� �ڵ� �Ҵ��
		circle.draw();
		
		//Line Ŭ���� �ν��Ͻ� �����Ͽ� ShapeŸ�Կ� �Ҵ�
		//Shape line=new Line(); //���� �߻�(Shape�� Line�� ��Ӱ���X �ڱ� Ŭ���� Ÿ�Ը� �Ҵ� ����)
		
		System.out.println("------------------------------------");
		
		Shape[] shapes= {circle, new Rectangle(), new Triangle()};
		for(Shape s: shapes) {
			s.draw();
		}
	}
}