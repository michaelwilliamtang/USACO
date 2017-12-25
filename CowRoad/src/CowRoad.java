import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CowRoad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("cow.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cow.out")));

		String testme = br.readLine();
		
		pw.println(testme);
		System.out.println("done");
		
		pw.print(testme);
		pw.println();
		pw.close();
		
	}

}
