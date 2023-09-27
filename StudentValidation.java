package Random;

import java.util.Scanner;

class Students {
	private String studentName;
	private String password;
	private int rollNo;

	public void setStudentName(String sn) {
		studentName = sn;
	}

	public void setPass(String ps) {
		password = ps;
	}

	public void setRollNo(int rn) {
		rollNo = rn;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getPass() {
		return password;
	}

	public int getRollNo() {
		return rollNo;
	}

}

public class StudentValidation {
	public static boolean validate(String name, String pass, int rolln, String vn, String vp, int vr) {
		// Students s = new Students();
		if (vn.equals(name) && vp.equals(pass) && vr == rolln) {
			// System.out.println("Valid Student");
			return true;
		} else {
			// System.out.println("not valid Student");
			return false;
		}
	}

	public static void main(String[] args) {
		Students s1 = new Students();
		Scanner sc = new Scanner(System.in);
		String sname, spass;
		int sroll;
		String vname, vpass;
		int vroll;
		s1.setStudentName("Om");
		s1.setRollNo(1);
		s1.setPass("zend");

		vname = s1.getStudentName();
		vpass = s1.getPass();
		vroll = s1.getRollNo();

		System.out.println(s1.getStudentName());
		System.out.print("Name: ");
		sname = sc.nextLine();
		System.out.print("Password: ");
		spass = sc.nextLine();
		System.out.print("Roll No: ");
		sroll = sc.nextInt();

		if (validate(sname, spass, sroll, vname, vpass, vroll)) {
			System.out.println("Valid Student");
			System.out.println("Name:" + s1.getStudentName());
			System.out.println("Roll No:" + s1.getRollNo());

		} else {
			System.out.println("Invalid Student");
		}

	}

}
