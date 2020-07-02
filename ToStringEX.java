package pk22;

class Book{
	String title;
	String author;
	
	Book(String t,String a){
		title=t; author=a;
	}
	public String toString() {
		return title+","+author;
	}
}
public class ToStringEX {

	public static void main(String[] args) {
		
		Book book = new Book("JAVA", "ȫ�浿");
		System.out.println(book);
		
		String str =new String("test");
		System.out.println(str);

	}

}
