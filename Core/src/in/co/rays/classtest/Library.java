package in.co.rays.classtest;

public class Library {
	int bookid;
	String bname;
	public Library(int bookid, String bname) {
		
		this.bookid = bookid;
		this.bname = bname;
	}
	
	@Override
	public String toString() {
		return "Library [bookid=" + bookid + ", bname=" + bname + "]";
	}
	
	

}
