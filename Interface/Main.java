public class Main {

	public static void main(String[] args) {
		BankInterface01 b1 = new BankImplementation("HDFC","M1142345234", 1839);
		UserDetailsInterface u1 = new BankImplementation("Shaurya", "1234567891", (long) 25664585, "HDFC");
		b1.BankInfo();
		u1.UserDetails();
	}

}
