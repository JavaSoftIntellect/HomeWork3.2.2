
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter N:");
		int a = in.nextInt();
		for(int i=1; i<=a; i++){
			if(i%3!=0 && i%7!=0){
				System.out.println(i + " ");
			}
		}
	}

}