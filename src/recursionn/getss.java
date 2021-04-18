package recursionn;

import java.util.ArrayList;
import java.util.*;

public class getss {

	public static void main(String[] args) {
          System.out.println(Getss("abc"));
	}

	public static ArrayList<String> Getss(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();

		rr = Getss(ros);

		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(cc+rrs);
		}

		return mr;
	}

}
