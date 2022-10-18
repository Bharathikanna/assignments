package week2.day1;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String text="I saw a lot of pine tree in a pine forest";
		String[] sp=text.split(" ");
		
		
		for(int i=0;i<sp.length;i++) {
		
			for(int j=i+1;j<sp.length;j++) {
			
				if(sp[i].equals(sp[j])) {
				
				sp[j]="";
			}
				
			}
			System.out.println(""+sp[i]);
		}
	}

}
