package pk22;


public class Circle implements Cloneable{
	
	
	Point point;
	int radius;
	
	Circle(int x,int y,int radius){
		this.point=new Point(x, y);
		this.radius=radius;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String toString() {
		return "������"+point+"�̰�,"+"��������"+radius+"�Դϴ�.";
	}
	
}
