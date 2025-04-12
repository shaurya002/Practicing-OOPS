
public class BankImplementation implements BankInterface01, UserDetailsInterface{
	public String BankName;
	public String EstdId;
	public int EstdYear;
	
	public String UserName;
	public String AccountNo;
	public long Balance;
	
	public BankImplementation(String bName, String EstdId, int EstdYear) {
		this.BankName = bName;
		this.EstdId = EstdId;
		this.EstdYear = EstdYear;
	}
	public BankImplementation(String name, String AccNo, Long Bal, String bName) {
		this.UserName = name;
		this.AccountNo = AccNo;
		this.Balance = Bal;
		this.BankName = bName;
	}

	public void BankInfo() {
		System.out.println("Bank Name "+ BankName);
		System.out.println("Bank Establishment Id "+ EstdId);
		System.out.println("Bank Establishment Year "+ EstdYear);
	}

	public void UserDetails() {
		System.out.println("User Name "+ UserName);
		System.out.println("Account Number "+ AccountNo);
		System.out.println("Account Balance "+ Balance);
		System.out.println("Bank Name "+ BankName);
	}
	
}
