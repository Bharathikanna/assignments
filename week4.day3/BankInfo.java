package week4.day3;

public class BankInfo {

	public void saving(int savings) {
		System.out.println("saving: "+savings);
	}
	public void fixed(int fixed ) {
		System.out.println("fixed: "+fixed);
	}
	public void deposit(int deposit) {
		System.out.println("deposit: "+deposit);
	}
	public static void main(String[] args) {
		
		BankInfo bankinfo =new BankInfo();
		bankinfo.deposit(2000);
		bankinfo.saving(1000);
		bankinfo.fixed(1000);
	}
}
