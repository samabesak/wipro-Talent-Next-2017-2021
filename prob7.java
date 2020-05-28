import java.util.Scanner;
public class AlternateEven {
	public static void main() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter max limit: ");
		int n = in.nextInt();
		for(int i = 2; i <= n; i += 4) {
			System.out.printf("%d\n", i);
		}
	}
}