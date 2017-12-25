import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class shuffle {

	public static int[] unshuffle(int[] shuffler, int[] ids) {
		int[] arr = new int[shuffler.length];
		for (int i = 0; i < shuffler.length; i++) {
			arr[i] = ids[shuffler[i]];
		}
		return arr;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));

		// pre-reading processes
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] shuffler = new int[n];
		int[] ids = new int[n];
		
		// reading
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			shuffler[i] = Integer.parseInt(st.nextToken()) - 1;
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			ids[i] = Integer.parseInt(st.nextToken());
		}
		
		// unshuffling
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		int[] array3 = new int[n];
		array1 = unshuffle(shuffler, ids);
		array2 = unshuffle(shuffler, array1);
		array3 = unshuffle(shuffler, array2);
		
		// printing
		for (int i : array3) {
			pw.println(i);
		}
		
		// closing
		br.close();
		pw.close();
	}

}
