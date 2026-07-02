
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();		
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int num = a;
		
		for (int i = 1; i < n; i++) {
			num += d;			
		}
		
		System.out.println(num);
		
		sc.close();
    }
}
