package seating.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatingArrangement {
	
	public static void main(String[] args) {
		List<Integer> L = new ArrayList<>();
		List<Integer> R = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// number of students
		String s = in.nextLine();	// It is a string like "RRLRLRLL" where i^th
								 	// character is the class of i^th student
		for(
		int i = 0;i<n;i++)

		{
			if (s.charAt(i) == 'L')
				L.add(i + 1);
			else
				R.add(i + 1);
		} for(

		int i = 0;i<n/2;i++)

		{
	         int x = (L.size() > 0) ? L.remove(0) : R.remove(0);
	         int y = 0;
	         if (L.size() > 0) {
	             y = findfrom(x, L, R);
	         } else if (R.size() > 0) {
	             y = findfrom(x, R, L);
	         }
	         System.out.println(x + " " + y);}

		
}
		private static int findfrom(int x, List<Integer> L, List<Integer> R) {
			int y = -1;
			int j = 0;
			do {
				y = L.get(j);
				j++;
			} while (Math.abs(y - x) == 1 && j < L.size());
			if (Math.abs(y - x) != 1)
				L.remove(new Integer(y));
			else
				y = findfrom(x, R, L);
			return y;
		}
}
