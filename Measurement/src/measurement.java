import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class measurement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("measurement.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));

		// pre-reading processes
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Map<Integer,String> myNames = new HashMap<Integer,String>();
		Map<Integer,Integer> myDeltas = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			Integer key = Integer.parseInt(st.nextToken());
			myNames.put(key, st.nextToken());
			myDeltas.put(key, Integer.parseInt(st.nextToken()));
			//System.out.println(key + "" + myNames.get(key));
		}
		
		int numChanges = 0, b = 7, e = 7, m = 7;
		Boolean bTop = true, eTop = true, mTop = true;
		Boolean bT = false, eT = false, mT = false;
		
		//int myVal = 7;
		
		SortedSet<Integer> myKeys = new TreeSet<Integer>(myNames.keySet());
		for (Integer i : myKeys) {
			String myName = myNames.get(i);
			Integer myDelta = myDeltas.get(i);
			if (myName.equals("Bessie"))
				b += myDelta;
			else if (myName.equals("Elsie"))
				e += myDelta;
			else
				m += myDelta;
			
			bT = bTop;
			eT = eTop;
			mT = mTop;
			
			// System.out.println(myName + " " + b + " " + e + " " + m);
			if (b > Math.max(e, m)) {
				bTop = true;
			//	myVal = b;
				eTop = false;
				mTop = false;
			}
			else if (m > Math.max(b, e)) {
				mTop = true;
				//myVal = m;
				eTop = false;
				bTop = false;
			}
			else if (e > Math.max(m, b)) {
				eTop = true;
				//myVal = e;
				bTop = false;
				mTop = false;
			}
			else if (b == e && b>m) {
				eTop = true;
				//myVal = e;
				bTop = true;
				mTop = false;
			}
			else if (b == m && b > e) {
				eTop = false;
				//myVal = b;
				bTop = true;
				mTop = true;
			}
			else if (e == m && e> b) {
				eTop = true;
				//myVal = e;
				bTop = false;
				mTop = true;
			}
			else {// if (e==m && b==m && e==b) {
				eTop = true;
				//myVal = e;
				bTop = true;
				mTop = true;
			}
			// System.out.println(temp + " " + top);
			if (eTop != eT || bTop != bT || mTop != mT)// && (bT || eT || mT))
				numChanges++;
		}
		
		pw.print(numChanges);
		br.close();
		pw.close();
	}

}
