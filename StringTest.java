package pk22;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody";
		String str2="Have a Nice Day!";

		
		str=str1+str2;
		System.out.println(str);
		
		System.out.println("str1 ���ڼ�: "+str1.length());
		
		System.out.println("str1 d���� ��ġ: "+str.indexOf("d"));
		
		System.out.println("str1  ��� �ҹ��ڷ� ��ȯ: "+str.toLowerCase());
		
		System.out.println("str1  ��� �빮�ڷ� ��ȯ: "+str.toUpperCase());
	}

}
