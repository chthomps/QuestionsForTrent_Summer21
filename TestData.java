
import java.util.Random;
import java.io.*;   //includes FileReader (reader class of java.io package) I'm reading that FileReader is the class that reads text files

public class TestData {
	
	//Test data consisting of ten lines (ten integer values 10-99)

	public static void main(String[] args) throws IOException {
		
		final int MAX= 10;
		
		int value;
		String fileName ="test.txt";
		
		PrintWriter outFile = new PrintWriter(fileName);
		
		Random rand = new Random();
		
		for (int line=1; line <= MAX; line++) {
			
			for (int num=1; num<= MAX; num++) {
				value = rand.nextInt(90) +10;
				outFile.print(value + " ");
			}
			
			outFile.println();
		}
		
		FileReader reader = new FileReader ("test.txt");  //FileReader attempt
		int character;
		while ((character = reader.read()) != -1) {
			System.out.print((char) character);	
		}
		
		
		outFile.close();
		System.out.println("Output file has been created: " + fileName);
		System.out.print(outFile);
	}
	
	
	}
	


