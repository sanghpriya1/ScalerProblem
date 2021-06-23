
public class MinSwaps2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 0 };
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			if (i  != a[i]) {
				int t = i;
				while (a[t] != i ) {
					t++;
				}
				int temp = a[t];
				a[t] = a[i];
				a[i] = temp;
				swap++;
			}
		}
		System.out.println(swap);
	}
	

}
