package week4.day3;

public class AxisBank extends BankInfo {
	public void deposit(int deposit) {
		System.out.println("deposit :"+deposit);
	}
	public static void main(String[] args) {
		AxisBank axisbank=new AxisBank();
		axisbank.deposit(5000);
	}

}
