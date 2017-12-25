import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//
// 2017 bronze modern art
//
public class ModernArt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("art.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("art.out")));

		String myline = br.readLine();
		
		int mysize = Integer.parseInt(myline);
		System.out.println("mysize=" + mysize);

		for (int myrow = 0; myrow < mysize; myrow++) {
			myline = br.readLine();
			for (int mycol = 0; mycol < mysize; mycol++) {
				
				String mycolor = "" + myline.charAt(mycol);
				System.out.println("row = " + myrow + " col=" + mycol + " color=" + mycolor);
				pw.print(mycolor);
			}
			pw.println();
		}
		pw.println();
		pw.close();
	}
}
