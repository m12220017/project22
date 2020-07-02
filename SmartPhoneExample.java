package pk22;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone=new SmartPhone("삼성","안드로이드");
		//System.out.println(myPhone);hashcode
		String strobj =myPhone.toString();

		System.out.println(strobj);
	}

}
