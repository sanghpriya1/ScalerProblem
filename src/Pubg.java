
public class Pubg {
	private static int gcd(int a, int b) {
		if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}
	public static void main(String[] args) {
		int[] arr = {2,3,4};
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			a = gcd(arr[i], a);
		}
		System.out.println(a);
	}

}
