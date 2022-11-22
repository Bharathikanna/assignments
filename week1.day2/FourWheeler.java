package week1.day2;

public class FourWheeler {
	
	public void applyBreak() {
		System.out.print("applyBreak");
	}
	public void applyGear() {
		System.out.print("applyGear");
	}
	public void switchOnAc() {
		System.out.print("switchOnAc");
	}
	public void applyAccelerate() {
		System.out.print("applyAccelerate");
	}
	public static void main(String[] args) {
		FourWheeler Car =new FourWheeler();
		Car.applyBreak();
		Car.applyGear();
		Car.switchOnAc();
		Car.applyAccelerate();
	}

}
