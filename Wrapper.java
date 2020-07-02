package pk22;

import javax.swing.JOptionPane;

public class Wrapper {

	public static void main(String[] args) {
		String str1="";
		String str2="";
		Double num1,num2;
		char cha='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2"));
		//JOptionPane.showInputDialog:입력패널을 보여주고 입력을 받는다.(스캐너와 같은역할)
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(cha)) {
			System.out.println(cha + "는 문자가 아닙니다.");
		}else {
			System.out.println(cha + "는 문자입니다.");
		}

	}

}
