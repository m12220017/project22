package pk22;

public class SmartPhone {
	private String company,os;
	SmartPhone(String company,String os){
		this.company=company;
		this.os=os;
	}
	public String toString() {
		return company+","+os;
	}
}
