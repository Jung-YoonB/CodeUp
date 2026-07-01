
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = sc.nextDouble();
		
		// (비트 단위) / 8 = 바이트 단위 변경
		double hb = (h * b * c * s) / 8;
		
		// (바이트 단위) / (1024 * 1024) = MB 단위 변경
		double hm = hb / (1024 * 1024);
		
		System.out.printf("%.1f MB", hm);
		
		sc.close();
    }
}
