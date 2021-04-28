package mc.sn.practice;

public abstract class Shape {
	public abstract void draw();
	
	public Shape() {}
	private String info;
	public Shape(String info) {
		this.info=info;
	}
	
	/*toString : 어떤 클래스가 자기 정보를 표시할 때 사용함
	 *이 오브젝트를 Shape 클래스에서 오버라이딩함*/
	@Override
	public String toString() { 
		return this.info;		
	}
}
