package in.co.rays.practicals;

public class Sorting {
	public static void main(String[] args) {
		int a[] = { 500, 452, 74, 25, 35, 94, 27 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			System.out.println(a[i]);
		}
	}
}
