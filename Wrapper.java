package pk22;

import javax.swing.JOptionPane;

public class Wrapper {

	public static void main(String[] args) {
		String str1="";
		String str2="";
		Double num1,num2;
		char cha='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2"));
		//JOptionPane.showInputDialog:�Է��г��� �����ְ� �Է��� �޴´�.(��ĳ�ʿ� ��������)
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(cha)) {
			System.out.println(cha + "�� ���ڰ� �ƴմϴ�.");
		}else {
			System.out.println(cha + "�� �����Դϴ�.");
		}

	}

}
