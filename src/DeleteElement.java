
public class DeleteElement {
	private static int gcd(int a, int b) {
		if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}
	public static void main(String[] args) {
		int[] arr = {7,2,5};
		int arr_gcd = arr[0];
		for(int i = 1; i < arr.length; i++)
			arr_gcd = gcd(arr[i],arr_gcd);
		if(arr_gcd == 1)System.out.println(0);
		else System.out.println(-1);
	}
}
