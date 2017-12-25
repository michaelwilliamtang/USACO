import java.io.*;

// template for reading and writing files
public class FarmerJohn {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
		
		String testme = br.readLine();
		pw.print(testme);
		pw.println();
		pw.close();
	}
}
