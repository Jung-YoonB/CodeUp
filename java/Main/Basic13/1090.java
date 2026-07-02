
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		long a = sc.nextInt();		
		long r = sc.nextInt();
		long n = sc.nextInt();
		
		long num = a;
		
		for (long i = 1; i < n; i++) {
			num *= r;			
		}
		
		System.out.println(num);
		
		sc.close();
    }
}
