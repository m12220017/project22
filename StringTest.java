package pk22;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody";
		String str2="Have a Nice Day!";

		
		str=str1+str2;
		System.out.println(str);
		
		System.out.println("str1 글자수: "+str1.length());
		
		System.out.println("str1 d글자 위치: "+str.indexOf("d"));
		
		System.out.println("str1  모두 소문자로 변환: "+str.toLowerCase());
		
		System.out.println("str1  모두 대문자로 변환: "+str.toUpperCase());
	}

}
