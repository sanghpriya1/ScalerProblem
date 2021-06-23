
public class DeleteOne {
	private static int gcd(int a, int b) {
		if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}
	public static void main(String[] args) {
		int[] arr = { 5, 15, 30};
		int length = arr.length;
		int[] prefixArr = new int[length];
		int[] sufffixArr = new int[length];
		int a = 0;
		int b= 0;
		for(int i = 0; i < length; i++) {
			b = arr[i];
			a = gcd(a, b);
			prefixArr[i] = a;
			
		}
		a = 0;
		for(int i = length-1; i >=0 ; i--) {
			b = arr[i];
			a = gcd(a, b);
			sufffixArr[i] = a;
		}
		int max_gcd = Integer.MIN_VALUE;
		a = 0;
		for(int i = 0; i < length; i++) {
			int x = 0;
			if(i-1 >= 0 && i+1 < length)
				max_gcd = Math.max(max_gcd, gcd(sufffixArr[i+1], prefixArr[i-1]));
			if(i-1 < 0)max_gcd = Math.max(max_gcd, gcd(sufffixArr[i+1], 0));
			if(i +1 >= length)max_gcd = Math.max(max_gcd, gcd(0, prefixArr[i-1]));


		}
		System.out.println(max_gcd);
				
	}
}
