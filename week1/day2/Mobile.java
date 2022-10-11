package week1.day2;

public class Mobile {
	
	public void sendMessage() {
		System.out.print("sendMessage");
		}
	public void shareDocument() {
		System.out.print("shareDocument");
		}
	public void call() {
		System.out.print("call");
		}
	public static void main (String[]  args) {
		Mobile phone =new Mobile();
		phone.sendMessage();
		phone.shareDocument();
		phone.call();
	}
		
		


}
