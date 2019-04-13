import java.util.Arrays;

public class Arrayss {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] A = { 0, 1, 1, 0, 1, 0, 0, 1 };
				int[] B = new int[30];
				Integer[] Brr = new Integer[20];
		
				int i = 0, j, n = A.length, t;
				System.out.println(Arrays.toString(A));
				// first element
				if (A[0] != 1) {
					System.out.println("Special Case");
					while (A[i++] == 0);
					j = A[0];
					A[0] = A[i];
					A[i] = j;
				}
				i = 0;
				while (i < n-2) {
					j = i + 1;
					while (A[j] != 0)
						j++;
					// swap if not adjacent
					if (j != i + 1) {
						t = A[j];
						A[j] = A[i+1];
						A[i+1] = t;
					}
					i += 2; // next pair
		
				}
				System.out.println(Arrays.toString(A));
	}

}
