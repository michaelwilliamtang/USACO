import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class billboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));

		StringTokenizer st;
		int[][] arr1 = new int[3][4];
		int[][] arr2 = new int[3][4];

		// reading
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
				arr2[i][j] = arr1[i][j];
			}
		}
		
		if (arr1[2][0] < arr1[0][0]) {
			arr1[2][0] = arr1[0][0];
		}
		if (arr1[2][1] < arr1[0][1]) {
			arr1[2][1] = arr1[0][1];
		}
		if (arr1[2][2] > arr1[0][2]) {
			arr1[2][2] = arr1[0][2];
		}
		if (arr1[2][3] > arr1[0][3]) {
			arr1[2][3] = arr1[0][3];
		}
		
		// arr2
		if (arr2[2][0] < arr2[1][0]) {
			arr2[2][0] = arr2[1][0];
		}
		if (arr2[2][1] < arr2[1][1]) {
			arr2[2][1] = arr2[1][1];
		}
		if (arr2[2][2] > arr2[1][2]) {
			arr2[2][2] = arr2[1][2];
		}
		if (arr2[2][3] > arr2[1][3]) {
			arr2[2][3] = arr2[1][3];
		}
		
		
		int area1 = Math.abs((arr1[0][2] - arr1[0][0])*(arr1[0][3] - arr1[0][1]));
		int area2 = Math.abs((arr2[1][2] - arr2[1][0])*(arr2[1][3] - arr2[1][1]));
		
		int reduced1 = Math.abs((arr1[2][2] - arr1[2][0])*(arr1[2][3] - arr1[2][1]));
		int reduced2 = Math.abs((arr2[2][2] - arr2[2][0])*(arr2[2][3] - arr2[2][1]));
		
		if (arr1[2][2] < arr1[2][0] || arr1[2][3] < arr1[2][1])
			reduced1 = 0;
		if (arr2[2][2] < arr2[2][0] || arr2[2][3] < arr2[2][1])
			reduced2 = 0;
				
		pw.println(area1 + area2 - reduced1 - reduced2);

		/*
		 * int xstart = arr[0][0], ystart = arr[0][1]; int xend = arr[2][0], yend =
		 * arr[2][1];
		 * 
		 * int unc1 = (xend-xstart) * (yend - ystart);
		 * 
		 * int area1; if (arr[2][0] - arr[0][0] > 0) area1 = ((arr[2][0] - arr[0][0] >
		 * 0)*(arr[2][0] - arr[0][0]); int area1 = ((arr[2][0] - arr[0][0] >
		 * 0)*(arr[2][0] - arr[0][0])*(arr[2][1] - arr[0][1] > 0)*(arr[2][1] -
		 * arr[0][1]);
		 * 
		 * pw.println();
		 */

		br.close();
		pw.close();
	}
}