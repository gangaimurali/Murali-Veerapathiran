package org.bank;

public class Stud {

	public void getstudentInfo(int id) {
		System.out.println("Student ID "+id);

	}
	public void getstudentInfo(int id, String name) {
		System.out.println("Student ID "+id);
		System.out.println("Sudent Name "+name);

	}
	public void getstudentInfo(String email, long phno) {
		System.out.println("Email "+email);
		System.out.println("Phone Number "+phno);

	}
	public static void main(String[] args) {
		Stud st=new Stud();
		st.getstudentInfo(123);
		st.getstudentInfo(234, "Murali");
		st.getstudentInfo("abc@abc.com", 123456789);
}
}
