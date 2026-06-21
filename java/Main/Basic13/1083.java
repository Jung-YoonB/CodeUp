import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			boolean isX = (i == 3) || (i == 6) || (i == 9);						
			if (isX) {
				System.out.print("X ");
			} else {			
			System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}
