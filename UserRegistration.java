package userRegeistrationRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String First_Name = "^[A-Z]{1}[a-z]{3,}$";
	private static final String Last_Name = "^[A-Z]{1}[a-z]{3,}$";
	private static final String mob_no = "^[9][1]{0,1}\\s[0-9]{10}";
	private static final String email = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";

	private static final String pwd1 = "^[a-zA-Z0-9_-]{8,}$";
	private static final String pwd2 = "^[a-zA-Z0-9_-]{8,}(?=.*[A-Z])+$";
	private static final String pwd3 = "^[a-zA-Z0-9_-]{8,}[?=.*A-Z]+[?=.*0-9]+$";
	private static final String pwd4 = "^[a-zA-Z0-9_-]{8,}[?=.*A-Z]+[?=.*0-9]+[?=.*! @#&()]{1}$";
	private static final String EMAIID = "^[a-zA-Z.+0-9_-]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z,]{2,}[.,a-zA-Z]?$";

	public boolean verifyFirstName(String fname) {

		Pattern pattern = Pattern.compile(First_Name);
		return pattern.matcher(fname).matches();

	}

	public boolean verifyLastName(String lname) {

		Pattern pattern = Pattern.compile(Last_Name);
		return pattern.matcher(lname).matches();

	}

	public boolean verifyMobileNumber(String pnumber) {

		Pattern pattern = Pattern.compile(mob_no);
		return pattern.matcher(pnumber).matches();
	}

	public boolean verifyEmailId(String emailid) {

		Pattern pattern = Pattern.compile(email);
		return pattern.matcher(emailid).matches();
	}

	public boolean verifyepassword1(String charPass) {

		Pattern pattern = Pattern.compile(pwd1);
		return pattern.matcher(charPass).matches();
	}

	public boolean verifypassword2(String pwd_rule2) {

		Pattern pattern = Pattern.compile(pwd2);
		return pattern.matcher(pwd_rule2).matches();
	}

	public boolean verifypassword3(String pwd_rule3) {

		Pattern pattern = Pattern.compile(pwd3);
		return pattern.matcher(pwd_rule3).matches();
	}

	public boolean verifypassword4(String pwd_rule4) {

		Pattern pattern = Pattern.compile(pwd4);
		return pattern.matcher(pwd_rule4).matches();
	}

	public boolean verify_emailid_samples(String email_samples) {

		Pattern pattern = Pattern.compile(EMAIID);
		return pattern.matcher(email_samples).matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		// UserRegistrationValidation entry = new UserRegistrationValidation();

		UserRegistration data = new UserRegistration();

		System.out.println("Fill up the form to Register");

		System.out.println("ENTER FIRST NAME : ");
		String fname = in.next();
		System.out.println(data.verifyFirstName(fname));

		System.out.println("ENTER LAST NAME : ");
		String lname = in.next();
		System.out.println(data.verifyFirstName(lname));

		System.out.println("ENTER EMAILID : ");
		String emailid = in.next();
		System.out.println(data.verifyFirstName(emailid));

		System.out.println("ENTER MOBILE NUMBER : ");
		String mobnumber = in.next();
		System.out.println(data.verifyMobileNumber(mobnumber));

		System.out.println("Enter password with min EIGHT CHARACTERS : ");
		String charPass = in.next();
		System.out.println(data.verifyepassword1(charPass));

		System.out.println("Enter password with one UPPERCASE : ");
		String pwd_rule2 = in.next();
		System.out.println(data.verifyepassword1(pwd_rule2));

		System.out.println("Enter Password with atleast one Numeric vale : ");
		String pwd_rule3 = in.next();
		System.out.println(data.verifyepassword1(pwd_rule3));

		System.out.println("Enter password with exactly one special character : ");
		String pwd_rule4 = in.next();
		System.out.println(data.verifyepassword1(pwd_rule4));

		System.out.println("Enter Email Id samples : ");
		String email_samples = in.next();
		System.out.println(data.verifyFirstName(email_samples));
		
		
		in.close();
	}

}
