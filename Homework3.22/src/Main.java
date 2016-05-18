import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = in.nextInt();
		System.out.print("Enter K:");
		int k = in.nextInt();
		int nf = 1, kf = 1;
		for (int i = 2; i <= n; i++) {
			nf *= i;
		}
		for (int i = 2; i <= k; i++) {
			kf *= i;
		}
		if (n > k && k > 1)
			System.out.print(nf/kf);
		else
			System.out.print("Invalid input.");

	}
}