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
			//instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ�
			if(obj instanceof Student) {
				//�ٿ�ĳ����
				Student std= (Student)obj;
				if(Studentid==std.Studentid)
					return true;
				else
					return false;
			}
			return false;
		}
	

}
