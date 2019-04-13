import java.io.*;
import java.util.*;

class Interval implements Comparable<Interval> {
	Integer start, end, price;

	public Interval(int s, int e, int p) {
		start = s;
		end = e;
		price = p;
	}

	public boolean isLessPrice(Interval I) {
		if (this.price.compareTo(I.price) <= 0)
			return true;
		return false;
	}

	public boolean isOverLapped(Interval I) {
		if (I.start.compareTo(this.end) < 0)
			return true;
		return false;
	}

	public String toString() {
		return (start + " " + end + " " + price);
	}

	@Override
	public int compareTo(Interval I) {
		return (price.compareTo(I.price));
	}
}

public class BestPrice {
	public static void main(String args[]) throws Exception {
		List<Interval> list = new ArrayList<Interval>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = Integer.MIN_VALUE;
		Interval last_interval = new Interval(0, 0, 0);
		scan.nextLine();
		int j = 0;
		while (j < n) {
			String line = scan.nextLine();
			String s[] = line.split(" ");
			Interval I = new Interval(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
			if (Integer.parseInt(s[1]) > max) {
				max = Integer.parseInt(s[1]);
				last_interval = I;
			}
			list.add(I);
			j++;
		}

		Interval I1 = list.get(0);
		Interval I2;
		boolean cheaperI1 = false;
		int last_endTime = I1.start - 1;
		List<Interval> overlapList = new ArrayList<Interval>();
		for (int i = 1; i < n; i++) {
			I2 = list.get(i);
			if (I1.isOverLapped(I2)) {
				if (I2.isLessPrice(I1)) {
					// print best price so far
					System.out.println(new Interval(last_endTime + 1, I2.start - 1, I1.price));
					last_endTime = I2.start - 1;
					I1 = I2;
				} else {
					// I2 is inside I1(cheaper)
					cheaperI1 = true;
					overlapList.add(I2);
				}
			} else {// No overlap
				boolean noLink = true;
				if (cheaperI1) {
					Collections.sort(overlapList);
					System.out.println("overlapList: " + overlapList);
					for (Interval J : overlapList) {
						if (J.isOverLapped(I2)) {
							System.out.println(new Interval(last_endTime + 1, J.end, J.price));
							last_endTime = J.end;
							I1 = J;
							noLink = false;
							overlapList.clear();
							break;
						}
					}
				}
				if((cheaperI1 && noLink) || !cheaperI1){
				System.out.println(new Interval(last_endTime + 1, I1.end, I1.price));
				last_endTime = I1.end;
				I1 = I2;
				}
			}
		}
		if (cheaperI1) {
			System.out.println(new Interval(last_endTime + 1, I1.end, I1.price));
			last_endTime = I1.end;
		}
		// last interval
		I1 = last_interval;
		if (last_endTime < I1.end) {
			System.out.println(new Interval(last_endTime + 1, I1.end, I1.price));
		}

	}
}

/*
7 
1 5 10 
3 7 9 
4 12 16  
5 10 19 
6 12 15 
10 20 20 
15 25 18
 */
