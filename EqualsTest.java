package pk22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee =new Student(100,"�̻��");
		Student studentLee2 =studentLee;
		Student studentSang =new Student(100,"�̻��");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee��studentLee2�� �ּҴ°����ϴ�.");
		}else {
			System.out.println("studentLee��studentLee2�� �ּҴ´ٸ��ϴ�.");
		}
		
		if(studentLee == studentSang) {
			System.out.println("studentLee��studentSang�� �ּҴ°����ϴ�.");
		}else {
			System.out.println("studentLee��studentSang�� �ּҴ´ٸ��ϴ�.");
		}
		
		if(studentLee.toString().equals(studentLee2.toString())) {
			System.out.println("studentLee��studentLee2�� ���ڴ°����ϴ�.");
		}else {
			System.out.println("%studentLee��studentLee2�� ���ڴ´ٸ��ϴ�.");
		}
		
		if(studentLee.toString().equals(studentSang.toString())) {
			System.out.println("studentLee��studentSang�� ���ڴ°����ϴ�.");
		}else {
			System.out.println("studentLee��studentSang�� ���ڴ´ٸ��ϴ�.");
		}//�ν��Ͻ� ������ ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode ��:"+studentLee.hashCode());
		System.out.println("studentSang�� hashcode ��:"+studentSang.hashCode());
		//�ν��Ͻ� ���� �־����� 
		System.out.println("studentLee�� �����ּ� ��:"+System.identityHashCode(studentLee));
		System.out.println("studentSang��  �����ּ� ��:"+System.identityHashCode(studentSang));
	}

}
