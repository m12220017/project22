package pk22;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVar1=new String("이호진");
		String strVar2="이호진";
		
		//물리적 비교판단
		if(strVar1==strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//논리적 비교판단
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		

	}

}
