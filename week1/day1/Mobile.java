package week1.day1;

public class Mobile {
	
	String mobileBrandName="Apple";
	char mobileLogo='@';
	short noOfMobilePiece=4563;
	int modelNumber=123456789;
	long mobileImeiNumber=12325442422342L;
	float mobilePrice=79999.99999F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		
		Mobile phone=new Mobile();
		System.out.println("Mobile brandname :"+phone.mobileBrandName);
		System.out.println("MobileLogo       :"+phone.mobileLogo);
		System.out.println("NoOfMobilePiece  :"+phone.noOfMobilePiece);
		System.out.println("ModelNumber      :"+phone.modelNumber);
		System.out.println("MobileImeiNumber :"+phone.mobileImeiNumber);
		System.out.println("MobilePrice      :"+phone.mobilePrice);
		System.out.println("IsDamaged?       :"+phone.isDamaged);
		
	}

}
