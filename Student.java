package pk22;

public class Student {

		int Studentid;
		String StudentName;
		Student(int a,String b) {
			Studentid=a;
			StudentName=b;
		}
		
		public int hashCode() {
			return Studentid;
		}
		public boolean equals(Object obj) {
			//instanceof : 연산자로써 객체타입 형변환이 가능한지의 여부를 판단
			if(obj instanceof Student) {
				//다운캐스팅
				Student std= (Student)obj;
				if(Studentid==std.Studentid)
					return true;
				else
					return false;
			}
			return false;
		}
	

}
