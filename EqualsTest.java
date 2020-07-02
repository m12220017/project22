package pk22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee =new Student(100,"이상원");
		Student studentLee2 =studentLee;
		Student studentSang =new Student(100,"이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee와studentLee2의 주소는같습니다.");
		}else {
			System.out.println("studentLee와studentLee2의 주소는다릅니다.");
		}
		
		if(studentLee == studentSang) {
			System.out.println("studentLee와studentSang의 주소는같습니다.");
		}else {
			System.out.println("studentLee와studentSang의 주소는다릅니다.");
		}
		
		if(studentLee.toString().equals(studentLee2.toString())) {
			System.out.println("studentLee와studentLee2의 문자는같습니다.");
		}else {
			System.out.println("%studentLee와studentLee2의 문자는다릅니다.");
		}
		
		if(studentLee.toString().equals(studentSang.toString())) {
			System.out.println("studentLee와studentSang의 문자는같습니다.");
		}else {
			System.out.println("studentLee와studentSang의 문자는다릅니다.");
		}//인스턴스 생성시 만들어지는 heap 메모리 주소
		System.out.println("studentLee의 hashcode 값:"+studentLee.hashCode());
		System.out.println("studentSang의 hashcode 값:"+studentSang.hashCode());
		//인스턴스 전에 주어지는 
		System.out.println("studentLee의 실제주소 값:"+System.identityHashCode(studentLee));
		System.out.println("studentSang의  실제주소 값:"+System.identityHashCode(studentSang));
	}

}
