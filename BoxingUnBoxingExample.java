package pk22;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing 기본타입을 객체로
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		//Integer obj3 = new Integer.valueOf("300");
		
		
		//Unboxing 객체를 기본타입으로 변수에 저장
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
	}

}
