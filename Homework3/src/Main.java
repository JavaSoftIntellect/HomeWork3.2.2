import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			if(i%3!=0 && i%7!=0) System.out.println(i);
		}
		in.close();

	}

}
