package in.co.rays;

public class ODD_EVEN {
	public static void main(String[] args) {
		int number = 1;

		while (number <= 10) {
			number++;
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
}
