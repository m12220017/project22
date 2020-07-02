package pk22;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	public int hashCode() {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단
		return number;
	}

	public boolean equals(Object obj) {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단
		if(obj instanceof Key) {
		//다운 캐스팅으로 obj가 Key클래스의 compareKey로 대입
			Key compareKey = (Key)obj;
			if(number==compareKey.number) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
