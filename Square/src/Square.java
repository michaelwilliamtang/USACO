import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Square {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("my.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("my.out")));
		
		String testme = br.readLine();
		pw.print(testme);
		pw.println();
		pw.close();
	
	}

}
