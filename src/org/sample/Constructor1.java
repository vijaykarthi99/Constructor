package org.sample;

public class Constructor1 {
	// default Constructor
	public Constructor1() {
		this(3451, "Chennai");
		System.out.println("Default Constructor");
	}

	// parameterized
	public Constructor1(String name1, String name2) {
		this("Turaipakkam-Chennai", 6000001);
		System.out.println("parameterzied Constructor Names:" + name1 + "\t" + name2);
	}

	public Constructor1(int officeId, String branch) {
		this("Greens Tech", "Vijay");

		System.out.println("parameterzied Constructor OfficeInfo:" + officeId + "\t" + branch);
	}

	public Constructor1(int mobilNo) {
		this("Vijay123@gmail.com",'M');
		System.out.println("parameterzied Constructor mobileNo:"+ mobilNo);
	}

	public Constructor1(String email,char status) {

		System.out.println("parameterzied Constructor e-mail:" + email+"\t"+status);
	}

	public Constructor1(String address, int pincode) {

		this(987664567);
		System.out.println("parameterzied Constructor Address:" + pincode + "\t" + address);
	}

	public static void main(String[] args) {
		Constructor1 a = new Constructor1();

	}
}
