package week1.day3;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int range=8;
		int firstNumber=0;
		int secondNumber=1;
		int sum=0;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
					
		for (int i = 1; i <=range; i++) {
						
		    sum=firstNumber+secondNumber;
		    firstNumber=secondNumber;
		    secondNumber=sum;
					
		System.out.println(sum);}
	}
}


