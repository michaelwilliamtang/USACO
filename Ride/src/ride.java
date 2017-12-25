/*
ID: michael287
LANG: JAVA
TASK: ride
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ride {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		
		String myComet = br.readLine();
		String myGroup = br.readLine();
		int comNum = 1, groupNum = 1;
		
		for (int i = 0; i < myComet.length(); i++) {
			comNum *= myComet.charAt(i) - 64;
		}
		for (int j = 0; j < myGroup.length(); j++) {
			groupNum *= myGroup.charAt(j) - 64;
		}
		//System.out.println(comNum + " " + groupNum); 
		
		if (comNum % 47 == groupNum % 47)
			pw.println("GO");
		else
			pw.println("STAY");
		
		br.close();
		pw.close();
	}

}
