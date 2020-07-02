package pk22;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		Circle c=new Circle(10, 20, 30);
		Circle cc=(Circle)c.clone();
		
		System.out.println(c);
		System.out.println(cc);
		//hash°ª
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(cc));
	}

}
