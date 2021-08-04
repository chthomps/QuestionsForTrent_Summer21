import java.util.Scanner;

public class StringReversal {

	private static String phraseEntry;
	private static int right, left;
	private String reversePhrase;

	
	
	//main method
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		phraseEntry= scan.nextLine();
	
		int left =0; 
		int right= phraseEntry.length()-1;  //why is this variable not being used?
		
		
		System.out.println("The reverse order of your input string is: " + StringReversal.reverseString(phraseEntry));
		scan.close();
	}
		
		
	//static method (reverseString) for reversing a string
		public static char reverseString(String phraseEntry) {
			if(phraseEntry.charAt(right) == phraseEntry.charAt(left))
				return phraseEntry.charAt(left);
			else
				return reverseString(phraseEntry.charAt(right)-1);  //wants to make this an int output- no
		}
			
		
	//need a toString method for printing output (I think)
		public String toString() {
			return reversePhrase;
		}
		


}


