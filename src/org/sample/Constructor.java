package org.sample;

public class Constructor extends Constructor1 {

	public Constructor() {
		this("Jack", "Rose");
		System.out.println("default Constructor");

	} 

	public Constructor(String name, String name2) {
		this(67889, 654327890);
		System.out.println("parameterzied Constructor:" + name + "\t" + name2);

	}

	public Constructor(String office, int officeId) {

		System.out.println("parameterzied Constructor:" + office + "\t" + officeId);
	}

	public Constructor(int empId, int mobile) {
		this("Rose123@gmail.com");
		System.out.println("parameterzied Constructor:" + empId + "\t" + mobile);
	}

	public Constructor(String email1) {
		this(1234535);
		System.out.println("parameterzied Constructor:" + email1);
	}

	public Constructor(int pincode) {
		this("Chennai", 631);
		System.out.println("parameterzied Constructor:" + pincode);
	}

	public static void main(String[] args) {

		Constructor b = new Constructor();

	}
}
