package week2.day1;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
	String test = "helloworld";
	
	char [] charArray = test.toCharArray();
	
	int length= charArray.length;
	
	for(int i=0;i<length;i++) {
		if(i%2!=0) {
			String strcpy="";
			strcpy=strcpy+charArray[i];
			System.out.println(strcpy.toUpperCase());
		}
		else
		{
			System.out.println(charArray[i]);
		}
	
	
	}

	}}
