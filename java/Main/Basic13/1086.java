
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		
		// (비트 단위) / 8 = 바이트 단위 변경
		double pb = (w * h * b) / 8;
		
		// (바이트 단위) / (1024 * 1024) = MB 단위 변경
		double pm = pb / (1024 * 1024);
		
		System.out.printf("%.2f MB", pm);
		
		sc.close();
    }
}
