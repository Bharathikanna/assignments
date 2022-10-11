package week1.day1;

public class TwoWheeler {
	
	int noofWheels=2;
	short noofMirrors=2;
	long chassisNumber=12334242424390l;
	boolean isPunctured=false;
	String bikename="Royal Enfield";
	double runningKM=46737.34;
	
	public static void main(String[] args) {
	
		TwoWheeler bike=new TwoWheeler();
		System.out.println("NoofWheels   :"+bike.noofWheels);
		System.out.println("NoofMirrors  :"+bike.noofMirrors);
		System.out.println("ChassisNumber:"+bike.chassisNumber);
		System.out.println("IsPunctured  :"+bike.isPunctured);
		System.out.println("Bikename     :"+bike.bikename);
		System.out.println("RunningKM    :"+bike.runningKM);
	}

}
