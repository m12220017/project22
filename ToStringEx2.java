package pk22;

class BK{
	
	int bookNumber;
	String bookTitle;
	
	BK(int bookNumber,String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	public String toString() {

		return bookNumber+","+bookTitle;
	}
}
public class ToStringEx2 {

	public static void main(String[] args) {
		BK b=new BK(200, "°³¹Ì");
		System.out.println(b);
		
	}

}
