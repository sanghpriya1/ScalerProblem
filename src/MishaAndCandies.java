import java.util.PriorityQueue;

public class MishaAndCandies {
	public static void main(String[] args) {
		int[] arr = { 110, 289, 585, 135, 314, 259, 238, 798, 954, 399, 492, 282, 311, 177, 804, 769, 191, 539, 830,
				806, 854, 50, 373, 329, 549, 202, 399, 542, 166, 986, 446, 346, 58, 269, 103, 267, 547, 171, 713, 408,
				847, 988, 704, 162, 850, 493, 59, 584, 588, 117, 639, 310, 615, 871, 977, 136, 973, 324, 450, 737, 778,
				139, 606, 98, 968, 275, 911, 558, 849, 62, 495, 512, 106, 682, 980, 9, 517, 104, 80, 540, 689, 696, 396,
				681, 541, 468, 12, 482, 459, 438, 924, 507, 725, 388, 579, 754, 421, 30, 151 };

		int a = 80;

		PriorityQueue<Integer> qp = new PriorityQueue<Integer>(arr.length, new MinHeap());
		for (int i = 0; i < arr.length; i++) {

			qp.add(arr[i]);
		}
		int ans = 0;
		while (qp.peek() <= a) {
			int y = qp.poll();

			int x = (int) Math.floor(y / 2);
			ans += x;
			y -= x;
			if (qp.isEmpty())
				break;
			int z = qp.poll();
			z += y;
			qp.add(z);
		}
		System.out.println(ans);
	}

}
