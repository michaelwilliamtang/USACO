import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CowQueue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("my.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("my.out")));

		int n = Integer.parseInt(br.readLine());
		String myLine;
		StringTokenizer st;
		
		int[] starts = new int[n];
		int[] durations = new int[n];
		
		for (int i = 0; i < n; i++) {
			myLine = br.readLine();
			st = new StringTokenizer(myLine);
			starts[i]= Integer.parseInt(st.nextToken());
			durations[1] = Integer.parseInt(st.nextToken());
		}
		
		Boolean[] states = new Boolean[n];
		int time = 0;
		int numProcessed = 0;
		
		for (int j = 0; j < n; j++) {
			// somehow find next cow to question
			int nextTime = Integer.MAX_VALUE;
			int nextCow= -1;
			for (int k = 0; k < n; k++) {
				if (starts[k] < nextTime) {
					nextCow = k;
					nextTime = starts[k];
				}
			}
			
			// change state to true
			// add to time
			// increment numProcessed, check if == n, if so done, write time
		}
		
		pw.println();
		pw.close();
	}

}
