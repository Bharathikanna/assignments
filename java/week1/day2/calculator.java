package week1.day2;

public class calculator {
	
	public void addTwoNumbers(int a,int b) {
		
		int c = a+b;
		System.out.println("addTwoNumbers       ="+c);
	}
	public void substractTwoNumbers(int e,int f) {
		
		int t = e-f;
		System.out.println("substractTwoNumbers ="+t);
	}
    public void mutiplyTwoNumbers(double i,double j) {
		
		double s = i*j;
		System.out.println("mutiplyTwoNumbers   ="+s);
	}
    public void divideTwoNumbers(float x,float y) {
		
		float z = x/y;
		System.out.println("divideTwoNumbers    ="+z);
	}
    public static void main(String[] args) {
    	calculator calc=new calculator();
    	calc.addTwoNumbers(45, 45);
    	calc.substractTwoNumbers(55, 50);
    	calc.mutiplyTwoNumbers(612.55463, 634.46337);
    	calc.divideTwoNumbers(564.4f, 856.4f);
    	
    }

}
