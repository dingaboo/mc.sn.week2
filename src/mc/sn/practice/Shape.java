package mc.sn.practice;

public abstract class Shape {
	public abstract void draw();
	
	public Shape() {}
	private String info;
	public Shape(String info) {
		this.info=info;
	}
	
	/*toString : � Ŭ������ �ڱ� ������ ǥ���� �� �����
	 *�� ������Ʈ�� Shape Ŭ�������� �������̵���*/
	@Override
	public String toString() { 
		return this.info;		
	}
}
